package quickCloud;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import quickCloud.Accounts;

public class dataDrivenTest {
	private WebDriver driver;
	
  @Test(dataProvider = "loginData")
	public void loginTest(String username, String password) throws Exception {
		// click login section
		driver.findElement(By.xpath("//span[contains(text(),'Customer Login')]")).click();
		Thread.sleep(1000);
		// Enter name
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(username);
		Thread.sleep(1000);
		// Enter password
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(password);
		Thread.sleep(1000);
		// Click Login button
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(2000);
	}
  @BeforeClass
  public void beforeClass() throws Exception {
	  Reporter.log("HomePageTest -> Setting up browser...",true);
		String baseurl = "http://hosting:8085/";
		String path ="C:\\Users\\Love\\Desktop\\data\\accounts.xlsx";
		String sheetName ="LoginTests";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\chromeDriverversions\\79\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
		
		Accounts.setExcelFile(path, sheetName);
		Reporter.log("HomePageTest -> Browser setup complete!",true);
  }
  
  @DataProvider(name = "loginData")
	public Object[][] dataProvider() {
		Object[][] testData = Accounts.accountDetails("Invalid_Login");
		return testData;
	}
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
