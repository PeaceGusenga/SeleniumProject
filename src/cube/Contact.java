package cube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Contact {
	public static WebElement element = null;

	// ***********************************
	// FIND ELEMENTS
	// ***********************************

	/*
	 * Returns Name field
	 * 
	 * @param driver 
	 * return
	 */
	public static WebElement nameField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='name']"));
		return element;
	}

	/*
	 * Returns Email field
	 * 
	 * @param driver 
	 * return
	 */
	public static WebElement emailField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='email']"));
		return element;
	}

	/*
	 * Returns Text Field
	 * 
	 * @param driver 
	 * return
	 */
	public static WebElement textField(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@id='message']"));
		return element;
	}

	/*
	 * Returns Send Button
	 * @param driver
	 * return
	 */
	public static WebElement sendButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@class='btn btn btn-special']"));
		return element;
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
		public static void clickSend(WebDriver driver) {
			element = sendButton(driver);
			element.click();
		}
	
		// ***********************************
		// SEND KEYS
		// ***********************************

		public static void sendName(WebDriver driver, Actions action, String nameField) throws InterruptedException {
			element = nameField(driver);
			action.moveToElement(element).perform();
			Thread.sleep(2000);
			element.sendKeys(nameField);
		}
		
		public static void sendMail(WebDriver driver, Actions action) throws InterruptedException {
			element = emailField(driver);
			action.moveToElement(element).perform();
			Thread.sleep(2000);
			element.sendKeys("peace@domain.com");
		}
		
		public static void sendText(WebDriver driver, Actions action,String txt) throws InterruptedException {
			element = textField(driver);
			action.moveToElement(element).perform();
			Thread.sleep(2000);
			element.sendKeys(txt);
		}
}
