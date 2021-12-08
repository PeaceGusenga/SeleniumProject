package quickCloud;

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
		element = driver.findElement(By.xpath("//a[@class='nav-link'][contains(text(),'Home')]"));	
		return element;	
	}
	/*
	 * Returns About Us tab
	 * @param driver
	 * @return
	 */
	public static WebElement aboutUsTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));	
		return element;	
	}
	/*
	 * Returns Features tab
	 * @param driver
	 * @return
	 */
	public static WebElement featuresTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Features')]"));	
		return element;	
	}
	/*
	 * Returns Hosting dropDown tab
	 * @param driver
	 * @return
	 */
	public static WebElement hostingDropDownTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='dropdown-a']"));	
		return element;	
	}
	/*
	 * Returns Domain tab
	 * @param driver
	 * @return
	 */
	public static WebElement domainTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Domain')]"));	
		return element;	
	}
	/*
	 * Returns Contact tab
	 * @param driver
	 * @return
	 */
	public static WebElement contactTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='nav-link'][contains(text(),'Contact')]"));	
		return element;	
	}
	/*
	 * Returns Pricing Tab
	 * @param driver
	 * @return
	 */
	public static WebElement pricingTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='nav-link'][contains(text(),'Pricing')]"));
		return element;
	}
	/*
	 * Returns Top of Page
	 * @param driver
	 * @return
	 */
	public static WebElement topPageSection(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='navbars-host']"));
		return element;
	}
	/*
	 * Returns slide1 right
	 * @param driver
	 * @return
	 */
	public static WebElement slide1(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='fa fa-angle-right']"));
		return element;
	}
	/*
	 * Returns enter Domain section
	 * @param driver
	 * @return
	 */
	public static WebElement enterDomainSection(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='domainnamehere']"));
		return element;
	}
	/*
	 * Returns search domain button
	 * @param driver
	 * @return
	 */
	public static WebElement searchDomain(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='btn btn-primary grd1']"));
		return element;
	}
	/*
	 * Returns Domain option 1
	 * @param driver
	 * @return
	 */
	public static WebElement domainOption1(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'.com')]"));
		return element;
	}
	/*
	 * Returns Domain option 2
	 * @param driver
	 * @return
	 */
	public static WebElement domainOption2(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'.net')]"));
		return element;
	}
	/*
	 * Returns Domain option 3
	 * @param driver
	 * @return
	 */
	public static WebElement domainOption3(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'.org')]"));
		return element;
	}
	/*
	 * Returns Domain option 4
	 * @param driver
	 * @return
	 */
	public static WebElement domainOption4(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'.tv')]"));
		return element;
	}
	/*
	 * Returns Domain option 5
	 * @param driver
	 * @return
	 */
	public static WebElement domainOption5(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'.info')]"));
		return element;
	}/*
	 * Returns Hosting section
	 * @param driver
	 * @return
	 */
	public static WebElement hostingSection(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Hosting Packages')]"));
		return element;
	}/*
	 * Returns About 1
	 * @param driver
	 * @return
	 */
	public static WebElement about1(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='overviews']//div[@class='container']//div[1]//div[1]//a[1]"));
		return element;
	}/*
	 * Returns About 2
	 * @param driver
	 * @return
	 */
	public static WebElement about2(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='row align-items-center']//div[2]//div[1]//a[1]"));
		return element;
	}/*
	 * Returns slide2 button
	 * @param driver
	 * @return
	 */
	public static WebElement slide2(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='timeline-nav-button timeline-nav-button--next']"));
		return element;
	}/*
	 * Returns Monthly Subscription
	 * @param driver
	 * @return
	 */
	public static WebElement monthlySub(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='active show']"));
		return element;
	}
	/*
	 * Returns Yearly Subscription
	 * @param driver
	 * @return
	 */
	public static WebElement yearlySub(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Yearly Subscription')]"));
		return element;
	}
	/*
	 * Returns Subscription 1
	 * @param driver
	 * @return
	 */
	public static WebElement sub1(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='tab1']//div[@class='row text-center']//div[1]//div[1]//div[1]"));
		return element;
	}
	/*
	 * Returns Subscription 2
	 * @param driver
	 * @return
	 */
	public static WebElement sub2(WebDriver driver) {
		element = driver.findElement(By.xpath("//h3[contains(text(),'$59/month')]"));
		return element;
	}
	/*
	 * Returns Subscription 3
	 * @param driver
	 * @return
	 */
	public static WebElement sub3(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='tab1']//h2[contains(text(),'Reseller Hosting')]"));
		return element;
	}
	/*
	 * Returns Order 1
	 * @param driver
	 * @return
	 */
	public static WebElement order1(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='tab1']//div[@class='row text-center']//div[1]//div[1]//div[4]//a[1]//span[1]"));
		return element;
	}
	/*
	 * Returns Order 2
	 * @param driver
	 * @return
	 */
	public static WebElement order2(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='tab1']//div[2]//div[1]//div[4]//a[1]"));
		return element;
	}
	/*
	 * Returns Order 3
	 * @param driver
	 * @return
	 */
	public static WebElement order3(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='tab1']//div[3]//div[1]//div[4]//a[1]"));
		return element;
	}
	/*
	 * Returns slide 3
	 * @param driver
	 * @return
	 */
	public static WebElement slide3(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='fa fa-angle-left effect-1']"));
		return element;
	}/*
	 * Returns green highlight 1
	 * @param driver
	 * @return
	 */
	public static WebElement gHighlight1(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='row logos']//div[1]//a[1]//img[1]"));
		return element;
	}/*
	 * Returns green highlight 2
	 * @param driver
	 * @return
	 */
	public static WebElement gHighlight2(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[2]//a[1]//img[1]"));
		return element;
	}/*
	 * Returns green highlight 3
	 * @param driver
	 * @return
	 */
	public static WebElement gHighlight3(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]//a[1]//img[1]"));
		return element;
	}
	/*
	 * Returns green highlight 4
	 * @param driver
	 * @return
	 */
	public static WebElement gHighlight4(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[4]//a[1]//img[1]"));
		return element;
	}
	/*
	 * Returns green highlight 5
	 * @param driver
	 * @return
	 */
	public static WebElement gHighlight5(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[5]//a[1]//img[1]"));
		return element;
	}/*
	 * Returns green highlight 6
	 * @param driver
	 * @return
	 */
	public static WebElement gHighlight6(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[6]//a[1]//img[1]"));
		return element;
	}/*
	 * Returns info link 1
	 * @param driver
	 * @return
	 */
	public static WebElement infoLink1(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='footer-links']//a[contains(text(),'Home')]"));
		return element;
	}/*
	 * Returns info link 2
	 * @param driver
	 * @return
	 */
	public static WebElement infoLink2(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Blog')]"));
		return element;
	}/*
	 * Returns info link 3
	 * @param driver
	 * @return
	 */
	public static WebElement infoLink3(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='footer-links']//a[contains(text(),'Pricing')]"));
		return element;
	}/*
	 * Returns info link 4
	 * @param driver
	 * @return
	 */
	public static WebElement infoLink4(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='footer-links']//a[contains(text(),'About')]"));
		return element;
	}/*
	 * Returns info link 5
	 * @param driver
	 * @return
	 */
	public static WebElement infoLink5(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Faq')]"));
		return element;
	}/*
	 * Returns info link 6
	 * @param driver
	 * @return
	 */
	public static WebElement infoLink6(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='footer-links']//a[contains(text(),'Contact')]"));
		return element;
	}/*
	 * Returns info link 7
	 * @param driver
	 * @return
	 */
	public static WebElement infoLink7(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'info@yoursite.com')]"));
		return element;
	}/*
	 * Returns info link 8
	 * @param driver
	 * @return
	 */
	public static WebElement infoLink8(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'www.yoursite.com')]"));
		return element;
	}/*
	 * Returns icon 1
	 * @param driver
	 * @return
	 */
	public static WebElement icon1(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='copyrights']//li[1]//a[1]"));
		return element;
	}/*
	 * Returns icon 2
	 * @param driver
	 * @return
	 */
	public static WebElement icon2(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='fa fa-github']"));
		return element;
	}/*
	 * Returns icon 3
	 * @param driver
	 * @return
	 */
	public static WebElement icon3(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='fa fa-twitter']"));
		return element;
	}/*
	 * Returns icon 4
	 * @param driver
	 * @return
	 */
	public static WebElement icon4(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='fa fa-dribbble']"));
		return element;
	}/*
	 * Returns icon 5
	 * @param driver
	 * @return
	 */
	public static WebElement icon5(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='copyrights']//li[5]//a[1]"));
		return element;
	}
	//********************************************
	// CLICK FUNCTIONS
	//********************************************
	
	public static void clickLoginTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Customer Login')]"));
		element.click();
	}
	public static void clickSlide1(WebDriver driver) throws InterruptedException{
		element = slide1(driver);
		element.click();
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
	}
	public static void domainTest(WebDriver driver) throws InterruptedException{
		element = enterDomainSection(driver);
		element.sendKeys("peaceautomation.com");
		Thread.sleep(1000);
		element = searchDomain(driver);
		element.click();
		element = domainOption1(driver);
		element.click();
		Thread.sleep(1000);
		element = domainOption2(driver);
		element.click();
		Thread.sleep(1000);
		element = domainOption3(driver);
		element.click();
		Thread.sleep(1000);
		element = domainOption4(driver);
		element.click();
		Thread.sleep(1000);
		element = domainOption5(driver);
		element.click();
		Thread.sleep(1000);
	}
	public static void clickSlide2(WebDriver driver) throws InterruptedException{
		element = slide2(driver);
		element.click();
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
	}
	
	//*************************
	//HOVER FUNCTION
	//*************************
	public static void highlightTest(WebDriver driver,Actions action) throws InterruptedException{
		element = slide3(driver);
		element.click();
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		
		element = gHighlight1(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = gHighlight2(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = gHighlight3(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = gHighlight4(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = gHighlight5(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = gHighlight6(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		
		element = infoLink1(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = infoLink2(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = infoLink3(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = infoLink4(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = infoLink5(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = infoLink6(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = infoLink7(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		
		element = icon1(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = icon2(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = icon3(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = icon4(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = icon5(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		
	}
	public static void subscriptionTest(WebDriver driver, Actions action) throws InterruptedException {
	//	element = yearlySub(driver);
	//	element.click();
	//	Thread.sleep(1000);
	//	element = monthlySub(driver);
	//	Thread.sleep(1000);
		element = sub1(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		Thread.sleep(1000);
		element = sub2(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		Thread.sleep(1000);
		element = sub3(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		Thread.sleep(1000);
		element = order1(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		Thread.sleep(1000);
		element = order2(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		Thread.sleep(1000);
		element = order3(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
	}
	public static void goToHostingSection(WebDriver driver, Actions action) throws InterruptedException{
		element = hostingSection(driver);
		action.moveToElement(element).perform();
		
	}
	public static void goToAbout1(WebDriver driver, Actions action) throws InterruptedException{
		element = about1(driver);
		action.moveToElement(element).perform();
		
	}
	public static void goToAbout2(WebDriver driver, Actions action) throws InterruptedException{
		element = about2(driver);
		action.moveToElement(element).perform();
		
	}
	public static void hostingDropDown(WebDriver driver) {
		element = hostingDropDownTab(driver);
		element.click();
	}
	
	public static void mouseHoverDropDownTab(WebDriver driver, Actions action) throws InterruptedException {
		element =hostingDropDownTab(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		
		WebElement subElement = driver.findElement(By.xpath("//a[contains(text(),'Web Hosting')]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//a[contains(text(),'WordPress Hosting')]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//a[contains(text(),'Cloud Server')]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//a[contains(text(),'Reseller Package')]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
		subElement = driver.findElement(By.xpath("//a[contains(text(),'Dedicated Hosting')]"));
		action.moveToElement(subElement).perform();
		Thread.sleep(1000);
	}
	public static void goThroughTabs(WebDriver driver, Actions action) throws InterruptedException{
		element = aboutUsTab(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = featuresTab(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		Home.mouseHoverDropDownTab(driver, action);
		element = domainTab(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = pricingTab(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		element = contactTab(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		
	}
	
	//*******************************
	//MOVE TO ELEMENT
	//********************************
	
	
	public static void moveToTopPageSection(WebDriver driver, Actions action) {
		element = topPageSection(driver);
		action.moveToElement(element).perform();
	}
	
}
