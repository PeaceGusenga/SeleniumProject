package quickCloud;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import quickCloud.Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class HomePageTest {
	private WebDriver driver;
	private Actions action;
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		Reporter.log("HomePageTest -> Setting up browser...",true);
		String baseUrl = "http://hosting:8085/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\chromeDriverversions\\79\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Reporter.log("HomePageTest -> Browser setup complete!",true);
		
	}

	@Test(priority=0, groups = {"test1"})
	public void firstTest() throws InterruptedException {
		/*
		 * Test 1 
		 * Highlights through the tabs
		 * Clicks through a slide
		 * Tests the domain inputBox
		 * 
		 */
		Reporter.log("HomePageTest -> Running Test 1...",true);
		Reporter.log("HomePageTest -> going through tabs",true);
		Home.goThroughTabs(driver, action);
		Reporter.log("HomePageTest -> clicking on slide",true);
		Home.clickSlide1(driver);
		Reporter.log("HomePageTest -> testing domain section...",true);
		Home.domainTest(driver);
		Reporter.log("HomePageTest -> Test 1 Complete!",true);
	}
	@Test(priority=1, groups = {"test2"})
	public void secondTest() throws InterruptedException {
		/*
		 * Test 2 
		 * Go to hosting section
		 * Go through about section
		 */
		Reporter.log("HomePageTest -> Running Test 2",true);
		Reporter.log("HomePageTest -> moving to hosting section",true);
		Home.goToHostingSection(driver, action);
		Reporter.log("HomePageTest -> Move to About 1",true);
		Home.goToAbout1(driver, action);
		Reporter.log("HomePageTest -> Move to About 2",true);
		Home.goToAbout2(driver, action);
		Reporter.log("HomePageTest -> Test 2 Complete!",true);
	}
	@Test(priority=2, groups = {"test3"})
	public void thirdTest() throws InterruptedException {
		/*
		 * Test 3 
		 * clicks on slide
		 */
		Reporter.log("HomePageTest -> Running Test 3",true);
		Reporter.log("HomePageTest -> clicking on slide",true);
		Home.clickSlide2(driver);
		Reporter.log("HomePageTest -> Test 3 Complete!",true);
	}
	@Test(priority=3, groups = {"test4"})
	public void fourthTest() throws InterruptedException {
		/*
		 * Test 4
		 * Highlights through subscription section
		 */
		Reporter.log("HomePageTest -> Running Test 4",true);
		Home.subscriptionTest(driver, action);
		Reporter.log("HomePageTest -> Test 4 Complete!",true);
	}
	@Test(priority=4, groups = {"test5"})
	public void lastTest() throws InterruptedException {
		/*
		 * Test 5
		 * Highlights all available elements in bottom half
		 * of web-page 
		 */
		Reporter.log("HomePageTest -> Running Test 5",true);
		Home.highlightTest(driver, action);
		Reporter.log("HomePageTest -> Test 5 Complete!",true);
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		driver.close();
	}

}
