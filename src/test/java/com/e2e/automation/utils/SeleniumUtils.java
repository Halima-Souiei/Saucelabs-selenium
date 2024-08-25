package com.e2e.automation.utils;

import java.io.FileInputStream; 
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

/**
 * This class contains all the methods required by selenium to perform actions
 * on webelement. It is a repository so that same code need not to be written
 * again.
 */
public class SeleniumUtils extends BasePageSaucelabs {

	/** properties. */
	protected Properties properties;

	/** config fis. */
	protected FileInputStream configFis;

	/** driver. */
	private static WebDriver driver;

	/**
	 * Instanciation de common utils.
	 */
	public SeleniumUtils() {
		super(driver);
		SeleniumUtils.driver = Setup.getDriver();
	}

	/**
	 * methode Locator value : to locate web element.
	 * 
	 * @param locatorTpye String locators
	 * @param value       the locator value
	 * @return byLocator
	 */
	public By locatorValue(String locatorTpye, String value) {
		By byLocator;
		final By obj = null;
		switch (locatorTpye) {
		case "id":
			byLocator = By.id(value);
			break;
		case "name":
			byLocator = By.name(value);
			break;
		case "xpath":
			byLocator = By.xpath(value);
			break;
		case "css":
			byLocator = By.cssSelector(value);
			break;
		case "linkText":
			byLocator = By.linkText(value);
			break;
		case "partialLinkText":
			byLocator = By.partialLinkText(value);
			break;
		default:
			byLocator = obj;
			break;
		}
		return byLocator;
	}

	/**
	 * method to open specified url.
	 *
	 * @param url to open
	 */
	public void get(String url) {
		driver.get(url);
	}

	/**
	 * method to navigate to specified page.
	 *
	 * @param url navigation url
	 */
	public void navigate(String url) {
		driver.navigate().to(url);
	}

	/**
	 * method to click on an element with action class.
	 *
	 * @param element to be clicked
	 */
	public void clickOnElementUsingActions(By element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(Setup.getDriver().findElement(element));
		actions.click().perform();
	}

	/**
	 * method to double click on an element with action class.
	 *
	 * @param element to be clicked
	 */
	public void doubleclickOnElementUsingActions(By element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(Setup.getDriver().findElement(element));
		actions.doubleClick().perform();
	}

	 
	/**
	 * Accesseur de l attribut title.
	 *
	 * @return title
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	/**
	 * Accesseur de l attribut page source.
	 *
	 * @return page source
	 */
	public String getPageSource() {
		return driver.getPageSource();
	}

	/**
	 * method to find an element.
	 *
	 * @param locator element to be found
	 * @return WebElement if found else throws NoSuchElementException
	 */
	public WebElement findElement(By locator) {
		try {
			return Setup.getDriver().findElement(locator);
		} catch (NoSuchElementException e) {
			log.error(this.getClass().getName(), "findElement", "Element not found " + locator);
			String message = e.getMessage();
			log.warn(message);
			throw new NoSuchElementException(message);
		}
	}

	/**
	 * method to clear field.
	 *
	 * @param element
	 */
	public void clearField(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			log.info(String.format("The following element could not be cleared: [%s]", element.getText()));
		}
	}
	/**
	 * methode Wait for element to be clickable
	 *
	 * @param locator
	 */
	public void waitForElementToBeClickable(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	
	/**
	 * Methode click on element.
	 *
	 * @param elementAttr
	 */
	public void click(WebElement elementAttr) {
		if (elementAttr.getClass().getName().contains("By")) {
			waitForElementToBeClickable(elementAttr);
			driver.findElement((By) elementAttr).click();
		} else {
			elementAttr.click();
		}
	}

	/**
	 * methode write text.
	 *
	 * @param elementAttr
	 * @param text
	 */
	public void writeText(WebElement elementAttr, String text) {
		if (elementAttr.getClass().getName().contains("By")) {
			clearField(elementAttr);
			driver.findElement((By) elementAttr).sendKeys(text);
		} else {
			clearField(elementAttr);
			elementAttr.sendKeys(text);
		}
	}

	 

}
