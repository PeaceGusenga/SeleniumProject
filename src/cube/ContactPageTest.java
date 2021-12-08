package cube;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import cube.Contact;

public class ContactPageTest {
	private WebDriver driver;
	private Actions action;

	@Test(groups = { "keypress", "click" })
	public void sendText() throws InterruptedException {
		/*
		 * Sends Text to TextField
		 */
		Reporter.log("ContactPageTest -> Running sendText()", true);
		Contact.sendName(driver, action, "Peace Gusenga");
		Reporter.log("ContactPageTest -> Name typed...", true);
		Thread.sleep(2000);
		Contact.sendMail(driver, action);
		Reporter.log("ContactPageTest -> Mail typed...", true);
		Thread.sleep(2000);
		Contact.sendText(driver, action, "This message sent to Test code :)");
		Reporter.log("ContactPageTest -> Custom Message sent...", true);
		Thread.sleep(2000);
		Contact.clickSend(driver);
		Thread.sleep(2000);
		Reporter.log("ContactPageTest -> sendText() Complete", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("ContactPageTest -> Setting up browser", true);
		String baseurl = "http://localhost:8085/contact.html";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\chromeDriverversions\\79\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
		Reporter.log("ContactPageTest -> Browser setup complete!", true);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
