package cube;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import cube.Portfolio;

public class PortfolioPageTest {
	private WebDriver driver;
	private Actions action;
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		Reporter.log("PortfolioPageTest -> Setting up browser", true);
		String baseurl = "http://localhost:8085/portfolio.html";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\chromeDriverversions\\79\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
		Reporter.log("PortfolioPageTest -> Browser setup complete!", true);
	}

	@Test(priority=1,groups= {"hover"})
	public void iconHoverTest() throws InterruptedException {
		/*
		 * hovers over icons
		 */
		Reporter.log("PortfolioPageTest -> Running iconHoverTest()",true);
		Portfolio.mouseHoverIcons(driver, action);
		Reporter.log("PortfolioPageTest -> iconHoverTest() Complete....",true);
	}
	@Test(priority=0,groups= {"click"})
	public void slideTest() throws InterruptedException {
		/*
		 * CLICKS ON NEXT SLIDE 
		 */
		Reporter.log("PortfolioPageTest -> Running slideTest()",true);
		Portfolio.clickDot2(driver);
		Reporter.log("PortfolioPageTest -> Clicked Once...",true);
		Thread.sleep(2000);
		Portfolio.clickDot3(driver);
		Thread.sleep(2000);
		Reporter.log("PortfolioPageTest -> Clicked Twice...",true);
		Reporter.log("PortfolioPageTest -> slideTest() Complete....",true);
	}
	@Test(priority=2,groups= {"click","keypress"})
	public void sendMail() throws InterruptedException {
	/*
	 * Sends Mail
	 */
		Reporter.log("PortfolioPageTest -> Running sendMail()",true);
		Portfolio.sendMail(driver, action);
		Reporter.log("PortfolioPageTest -> Mail address typed...",true);
		Thread.sleep(2000);
		Portfolio.clickSendMail(driver);
		Reporter.log("PortfolioPageTest -> SEND Button Clicked!",true);
		Reporter.log("PortfolioPageTest -> End of sendMail()",true);
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		driver.close();
	}

}
