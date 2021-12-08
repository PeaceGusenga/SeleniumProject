package cube;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import cube.About;

public class AboutPageTest {
	private WebDriver driver;
	private Actions action;
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		Reporter.log("AboutPageTest -> Setting up browser", true);
		String baseurl = "http://localhost:8085/about.html";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\chromeDriverversions\\79\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
		Reporter.log("AboutPageTest -> Browser setup complete!", true);
	}

	@Test(priority=0,groups= {"hover"})
	public void iconHoverTest() throws InterruptedException {
		/*
		 * hovers over icons
		 */
		Reporter.log("AboutPageTest -> Running iconHoverTest()",true);
		About.mouseHoverIcons(driver, action);
		Reporter.log("AboutPageTest -> iconHoverTest() Complete....",true);
	}
	@Test(priority=1,groups= {"click"})
	public void slideTest() throws InterruptedException {
		/*
		 * CLICKS ON NEXT SLIDE 
		 */
		Reporter.log("AboutPageTest -> Running slideTest()",true);
		About.clickDot2(driver);
		Reporter.log("AboutPageTest -> Clicked Once...",true);
		Thread.sleep(2000);
		About.clickDot3(driver);
		Thread.sleep(2000);
		Reporter.log("AboutPageTest -> Clicked Twice...",true);
		Reporter.log("AboutPageTest -> slideTest() Complete....",true);
	}
	@Test(priority=2,groups= {"click","keypress"})
	public void sendMail() throws InterruptedException {
	/*
	 * Sends Mail
	 */
		Reporter.log("AboutPageTest -> Running sendMail()",true);
		About.sendMail(driver, action);
		Reporter.log("AboutPageTest -> Mail address typed...",true);
		Thread.sleep(2000);
		About.clickSendMail(driver);
		Reporter.log("AboutPageTest -> SEND Button Clicked!",true);
		Reporter.log("AboutPageTest -> End of sendMail()",true);
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		driver.close();
	}

}
