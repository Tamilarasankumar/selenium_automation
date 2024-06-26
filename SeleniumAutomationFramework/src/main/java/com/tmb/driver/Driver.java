package com.tmb.driver;

import java.util.Objects;



public final class Driver() {
	public Driver() {
	}

	public static WebDriver driver;
	
	public static void initDriver() {
		if(Objects.isNull(driver)) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
	        driver = new ChromeDriver();  // Initialize the instance variable
	        DriverManager.setDriver(driver);
	        DriverManager.getdriver.get("https://www.google.com");	
	}

	
	public static void quitDriver() {
		driver.quit();
	}
}
