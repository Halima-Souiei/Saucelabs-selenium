package com.e2e.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Class Wait.
 */
public class Wait {

	/* driver */
	private WebDriver driver;

	/**
	 * Instanciation de wait.
	 *
	 * @param driver
	 */

	public Wait(WebDriver driver) {
		this.driver = driver;
	}

	/// **
	// * methode Wait until clickable.
	// *
	// * @param driver
	// * @param by
	/*
	 * @return web element //
	 */

	/**
	 * methode Wait until clickable.
	 *
	 * @param driver
	 * @param webElement
	 * @return web element
	 */
	public static WebElement waitUntilClickable(WebDriver driver, WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}

}
