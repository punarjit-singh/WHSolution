package com.cucumber.automation.utils;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	  public static WebDriver driver;
	  public static WebDriverWait waitVar = null;

	  public static String baseURL = "https://www.williamhill.com.au/";

	  /**
	   *  This function is to invoke Selenium Webdriver 
	   * @throws MalformedURLException
	   * @throws InterruptedException
	   */
	  
	  public void createDriver() throws MalformedURLException,
	  InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", config.firefoxDriver);
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	    driver.get(baseURL);

	    waitVar = new WebDriverWait(driver, 15);
	  }

	  /**
	   * This function is to close driver instance
	   */
	  public void teardown() {
	    if (driver != null) {
	    	driver.quit();
	    }
	  }
	
}
