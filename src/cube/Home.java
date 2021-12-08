package cube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home {
	public static WebElement element = null;
	
	
	//******************************************
	// FIND ELEMENTS
	//******************************************
	
	
	/*
	 * Returns Home tab
	 * @param driver
	 * @return
	 */
	public static WebElement homeTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='col-xs-10 text-right menu-1']//a[contains(text(),'Home')]"));	
		return element;	
	}
	/*
	 * Returns About tab
	 * @param driver
	 * @return
	 */
	public static WebElement aboutTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='col-xs-10 text-right menu-1']//a[contains(text(),'About')]"));	
		return element;	
	}
	/*
	 * Returns Services dropDownTab
	 * @param driver
	 * @return
	 */
	public static WebElement servicesDropDownTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='col-xs-10 text-right menu-1']//a[contains(text(),'Services')]"));	
		return element;	
	}
	/*
	 * Returns dropDown tab
	 * @param driver
	 * @return
	 */
	public static WebElement dropDownTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='col-xs-10 text-right menu-1']//a[contains(text(),'Dropdown')]"));	
		return element;	
	}
	/*
	 * Returns Portfolio tab
	 * @param driver
	 * @return
	 */
	public static WebElement portfolioTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='col-xs-10 text-right menu-1']//a[contains(text(),'Portfolio')]"));	
		return element;	
	}
	/*
	 * Returns Contact tab
	 * @param driver
	 * @return
	 */
	public static WebElement contactTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='col-xs-10 text-right menu-1']//a[contains(text(),'Contact')]"));	
		return element;	
	}
	/*
	 * Returns Make Your Life Simpler Section
	 * @param driver
	 * @return
	 */
	public static WebElement imageHighlight1(WebDriver driver) {
		element = driver.findElement(By.xpath("//body/div[@id='page']/div[@class='gtco-section gtco-products']/div[@class='gtco-container']/div[@class='row row-pb-md']/div[1]/a[1]/div[1]"));
		return element;
	}
	/*
	 * Returns Top of Page
	 * @param driver
	 * @return
	 */
	public static WebElement topPageSection(WebDriver driver) {
		element = driver.findElement(By.xpath("//body/div[@id='page']/nav[@class='gtco-nav']/div[@class='gtco-container']/div[@class='row']/div[@class='col-xs-10 text-right menu-1']/ul[1]"));
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
	/*
	 * Returns mail section
	 * @param driver
	 * @return
	 */
	public static WebElement findSendButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		return element;
	}
	
	//********************************************
	// CLICK FUNCTIONS
	//********************************************
	
	
	/*
	 * Clicks Home Tab
	 * @param driver
	 *
	 */
	public static void clickHomeTab(WebDriver driver) {
		element = homeTab(driver);
		element.click();
	}
	/*
	 * Clicks About Tab
	 * @param driver
	 *
	 */
	public static void clickAboutTab(WebDriver driver) {
		element = aboutTab(driver);
		element.click();
	}
	/*
	 * Clicks Services Tab
	 * @param driver
	 *
	 */
	public static void clickServicesTab(WebDriver driver) {
		element = servicesDropDownTab(driver);
		element.click();
	}
	/*
	 * Clicks Services Tab
	 * @param driver
	 *
	 */
	public static void clickDropDownTab(WebDriver driver) {
		element = dropDownTab(driver);
		element.click();
	}
	/*
	 * Clicks Portfolio Tab
	 * @param driver
	 *
	 */
	public static void clickPortfolioTab(WebDriver driver) {
		element = portfolioTab(driver);
		element.click();
	}
	/*
	 * Clicks Contact Tab
	 * @param driver
	 *
	 */
	public static void clickContactTab(WebDriver driver) {
		element = contactTab(driver);
		element.click();
	}
	/*
	 * Clicks Send Button
	 * @param driver
	 *
	 */
	public static void clickSendMail(WebDriver driver) throws InterruptedException {
		element = findSendButton(driver);
		Thread.sleep(3000);
		element.click();
	}
	
	//*************************
	//HOVER FUNCTION
	//*************************
	
	public static void mouseHoverServicesDropDown(WebDriver driver, Actions action) throws InterruptedException {
		element = driver.findElement(By.xpath("//body/div[@id='page']/nav[@class='gtco-nav']/div[@class='gtco-container']/div[@class='row']/div[@class='col-xs-10 text-right menu-1']/ul/li[3]"));
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		WebElement subElement = driver.findElement(By.xpath("//nav[@class='gtco-nav']//li[3]//ul[1]//li[1]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//nav[@class='gtco-nav']//li[3]//ul[1]//li[2]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//nav[@class='gtco-nav']//li[3]//ul[1]//li[3]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//nav[@class='gtco-nav']//li[3]//ul[1]//li[4]"));
		action.moveToElement(subElement).perform();
	}
	

	
	public static void mouseHoverDropDownTab(WebDriver driver, Actions action) throws InterruptedException {
		
		WebElement subElement = driver.findElement(By.xpath("//ul[@class='dropdown animated-fast fadeInUpMenu']//a[contains(text(),'HTML5')]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//ul[@class='dropdown animated-fast fadeInUpMenu']//a[contains(text(),'CSS3')]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//ul[@class='dropdown animated-fast fadeInUpMenu']//a[contains(text(),'Sass')]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//ul[@class='dropdown animated-fast fadeInUpMenu']//a[contains(text(),'jQuery')]"));
		action.moveToElement(subElement).perform();
	}
	
	
	//*******************************
	//MOVE TO ELEMENT
	//********************************
	
	public static void moveToImageSection(WebDriver driver, Actions action) throws InterruptedException {
		element = imageHighlight1(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		
		WebElement subElement = driver.findElement(By.xpath("//body/div[@id='page']/div[@class='gtco-section gtco-products']/div[@class='gtco-container']/div[@class='row row-pb-md']/div[1]/a[2]/div[1]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(2000);
		
		subElement = driver.findElement(By.xpath("//a[@class='gtco-item one-row bg-img animate-box fadeInUp animated-fast']//div[@class='overlay']"));
		action.moveToElement(subElement).perform();
		Thread.sleep(2000);
		
		subElement = driver.findElement(By.xpath("//body/div[@id='page']/div[@class='gtco-section gtco-products']/div[@class='gtco-container']/div[@class='row row-pb-md']/div[3]/a[1]/div[1]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(2000);
		
		subElement = driver.findElement(By.xpath("//body/div[@id='page']/div[@class='gtco-section gtco-products']/div[@class='gtco-container']/div[@class='row row-pb-md']/div[3]/a[2]/div[1]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(2000);
	}
	
	public static void moveToTopPageSection(WebDriver driver, Actions action) {
		element = topPageSection(driver);
		action.moveToElement(element).perform();
	}
	
	//***********************************
	//SEND KEYS
	//***********************************
	
	public static void sendMail(WebDriver driver, Actions action) {
		element = findMailSection(driver);
		action.moveToElement(element).perform();
		
		element.sendKeys("peace@domain.com");
	}
}
