package com.e2e.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageSaucelabs {
	protected WebDriver driver;
	/**Log*/
	protected static Logger log = LogManager.getLogger();
	
	public BasePageSaucelabs(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}


