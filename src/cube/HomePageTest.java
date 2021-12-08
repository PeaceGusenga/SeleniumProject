package cube;

import org.testng.annotations.Test;

import cube.Home;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.interactions.Actions;

public class HomePageTest {
	private WebDriver driver;
	private Actions action;
	JavascriptExecutor js;
	@BeforeClass(alwaysRun=true)
	  public void beforeClass() {
		Reporter.log("HomePageTest -> Setting up browser...",true);
		String baseurl = "http://localhost:8085/index.html";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\chromeDriverversions\\79\\chromedriver.exe");	
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
		Reporter.log("HomePageTest -> Browser setup complete!",true);
	  }
  @Test(groups = {"click","tab"})
  public void clickTest() throws InterruptedException {
	  /*
	   * clicks on all available tabs
	   */
		Reporter.log("HomePageTest -> Running clickTest()", true);
		Home.clickAboutTab(driver);
		Thread.sleep(2000);
		Home.clickHomeTab(driver);
		Thread.sleep(2000);
		Home.clickServicesTab(driver);
		Thread.sleep(2000);
		Home.clickDropDownTab(driver);
		Thread.sleep(2000);
		Home.clickPortfolioTab(driver);
		Thread.sleep(2000);
		Home.clickContactTab(driver);
		Thread.sleep(1000);
		Home.clickHomeTab(driver);
		Reporter.log("HomePageTest -> End of clickTest()", true);
  }
  
  @Test(groups = {"mouse","tab","hover"})
  public void hoverTest() throws InterruptedException {
	  /*
	   * Highlights through the drop-down lists
	   */
	  Reporter.log("HomePageTest -> Running hoverTest()",true);
	 Home.mouseHoverServicesDropDown(driver, action);
	 Thread.sleep(2000);
	 Home.clickDropDownTab(driver);
	 Home.mouseHoverDropDownTab(driver, action); 
	 Reporter.log("HomePageTest -> End of hoverTest()",true);
  }
  
  @Test(groups = {"hover","mouse","img"})
  public void imageTest() throws InterruptedException {
	/*
	 * highlights through the images available on the Home PAGE
	 */
	  Reporter.log("HomePageTest -> Running imageTest()",true);
	 Home.moveToImageSection(driver, action);
	  Reporter.log("HomePageTest -> End of imageTest()",true);
  }
  
  @Test(groups = {"click","keypress"})
  public void sendMailTest() throws InterruptedException {
	  /*
	   * enters mail at bottom of page
	   */
	  Reporter.log("HomePageTest -> Running sendMailTest()",true);
	  Home.sendMail(driver, action);
	  Thread.sleep(2000);
	  Reporter.log("HomePageTest -> Mail address typed...",true);
	  Home.clickSendMail(driver);
	  Thread.sleep(2000);
	  Reporter.log("HomePageTest -> SEND Button Clicked!",true);
	  Reporter.log("HomePageTest -> End of sendMailTest()",true);
	
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  driver.close();
  }

}
