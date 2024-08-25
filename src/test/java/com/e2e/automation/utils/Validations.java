package com.e2e.automation.utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class is used to perform various kinds of validations in the test cases.
 */
public class Validations extends BasePageSaucelabs {

	private WebDriver driver;

	/**
	 * Instanciation de assertions.
	 */
	public Validations() {
		super(Setup.getDriver());
		this.driver = Setup.getDriver();
	}

	public void assertTrue(WebElement element, String text) {
		String text1 = element.getText();
		Assert.assertTrue(text1.contains(text));

	}

	/**
	 * method verify element is present.
	 */
	public void assertEquals(WebElement element, String text) {
		String text1 = element.getText();
		Assert.assertEquals(text1, text);

	}

}
