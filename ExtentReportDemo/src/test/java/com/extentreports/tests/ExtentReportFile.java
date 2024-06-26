package com.extentreports.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportFile {

	@Test
	public void extentTest(){
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Reports Demo");
		extent.attachReporter(spark);
		
		ExtentTest test=extent.createTest("Login Test").assignAuthor("Tamil").assignCategory("Smoke").assignCategory("Regression").assignDevice("chrome 84");
		test.pass("Login test started successfully");
		test.info("URL is loaded");
		test.info("values entered");
		test.pass("Login Test Completed successfully");
		
		ExtentTest test1=extent.createTest("Homepage Test").assignCategory("Regression").assignAuthor("Rahul").assignDevice("Firefox 60");
		test1.pass("home page test started successfully");
		test1.info("URL is loaded");
		test1.info("values entered");
		test1.fail("homepage Test failed");
		
		
		extent.flush(); //unless you call this method, your report will not be written with logs
      
		
	
		
		
		
	}
}
