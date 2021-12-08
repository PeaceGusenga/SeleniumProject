package cube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Portfolio {
	public static WebElement element = null;

	// ***********************************
	// FIND ELEMENTS
	// ***********************************

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
	 * Returns HOME
	 * 
	 * @param driver return
	 */
	public static WebElement homeLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='gtco-list-link']//a[contains(text(),'Home')]"));
		return element;
	}

	/*
	 * Returns FEATURES
	 * 
	 * @param driver return
	 */
	public static WebElement featuresLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Features')]"));
		return element;
	}

	/*
	 * Returns PRODUCTS
	 * 
	 * @param driver return
	 */
	public static WebElement productsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
		return element;
	}

	/*
	 * Returns TESTIMONIAL
	 * 
	 * @param driver return
	 */
	public static WebElement testimonialLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Testimonial')]"));
		return element;
	}

	/*
	 * Returns CONTACT
	 * 
	 * @param driver return
	 */
	public static WebElement contactLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='gtco-list-link']//a[contains(text(),'Contact')]"));
		return element;
	}

	/*
	 * Returns COMPANY NUMBER
	 * 
	 * @param driver return
	 */
	public static WebElement companyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'+1 234 4565 2342')]"));
		return element;
	}

	/*
	 * Returns COMPANY MAIL
	 * 
	 * @param driver return
	 */
	public static WebElement companyMail(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'info@domain.com')]"));
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
	 * 
	 * @param driver
	 * 
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
		element = homeLink(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		WebElement subElement = featuresLink(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = productsLink(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = testimonialLink(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = contactLink(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = companyNumber(driver);
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = companyMail(driver);
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
		Thread.sleep(3000);
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
