package cube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class About {
	public static WebElement element = null;
	
	// ***********************************
	// FIND ELEMENTS
	// ***********************************

	/*
	 * Returns Facebook Icon 1
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement facbookIcon1(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[4]//div[1]//div[1]//ul[1]//li[1]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns Facebook icon 2
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement facbookIcon2(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[5]//div[1]//div[1]//ul[1]//li[1]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns Facebook icon 3
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement facbookIcon3(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[6]//div[1]//div[1]//ul[1]//li[1]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns Twiiter icon 1
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement twitterIcon1(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[4]//div[1]//div[1]//ul[1]//li[2]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns Twitter icon 2
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement twitterIcon2(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[5]//div[1]//div[1]//ul[1]//li[2]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns Twitter icon 3
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement twitterIcon3(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[6]//div[1]//div[1]//ul[1]//li[2]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns LinkedIn icon 1
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement linkedInIcon1(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[4]//div[1]//div[1]//ul[1]//li[3]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns LinkedIn icon 2
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement linkedInIcon2(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[5]//div[1]//div[1]//ul[1]//li[3]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns LinkedIn icon 3
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement linkedInIcon3(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[6]//div[1]//div[1]//ul[1]//li[3]//a[1]//i[1]"));
		return element;
	}

	/*
	 * Returns dot 2
	 * 
	 * @param driver return
	 */
	public static WebElement dot2(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='owl-dots']//div[2]//span[1]"));
		return element;
	}

	/*
	 * Returns dot 3
	 * 
	 * @param driver return
	 */
	public static WebElement dot3(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]//span[1]"));
		return element;
	}

	/*
	 * Returns mail section
	 * 
	 * @param driver
	 * 
	 * @return
	 */
	public static WebElement findSendButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		return element;
	}
	/*
	 * Returns mail section
	 * @param driver
	 * @return
	 */
	public static WebElement findMailSection(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		return element;
	}

	// *************************
	// HOVER FUNCTION
	// *************************

	public static void mouseHoverIcons(WebDriver driver, Actions action) throws InterruptedException {
		element = facbookIcon1(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		WebElement subElement = twitterIcon1(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = linkedInIcon1(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = facbookIcon2(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = twitterIcon2(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = linkedInIcon2(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = facbookIcon3(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = twitterIcon3(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = linkedInIcon3(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
	}

	// ********************************************
	// CLICK FUNCTIONS
	// ********************************************

	/*
	 * Clicks Dot 2
	 * 
	 * @param driver
	 *
	 */
	public static void clickDot2(WebDriver driver) {
		element = dot2(driver);
		element.click();
	}

	/*
	 * Clicks Dot 3
	 * 
	 * @param driver
	 *
	 */
	public static void clickDot3(WebDriver driver) {
		element = dot3(driver);
		element.click();
	}

	/*
	 * Clicks Send Button
	 * 
	 * @param driver
	 *
	 */
	public static void clickSendMail(WebDriver driver) throws InterruptedException {
		element = findSendButton(driver);
		Thread.sleep(2000);
		element.click();
	}

	// ***********************************
	// SEND KEYS
	// ***********************************

	public static void sendMail(WebDriver driver, Actions action) throws InterruptedException {
		element = findMailSection(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		element.sendKeys("peace@domain.com");
	}
}
