package browserSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class startUp {
 
	public static void setFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public static void setChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public static void openChromeBrowser(String baseurl) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	public static void openFirefoxBrowser(String baseurl) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Love\\Documents\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
}

