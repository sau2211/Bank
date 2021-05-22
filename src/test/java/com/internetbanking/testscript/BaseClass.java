package com.internetbanking.testscript;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.internetbanking.utilities.ReadConfig;

public class BaseClass {

	
	 ReadConfig rc = new ReadConfig();
	public String baseUrl = rc.getBaseUrl();
	public String username = rc.getUserName();
	public String password = rc.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setUp()
	{
		 System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 

		 
		 logger = Logger.getLogger("internetbanking");
		 PropertyConfigurator.configure("log4j.properties");
		 
	}
	 @AfterClass
	 public void tearDown()
	 {
		 driver.quit();
	 }
	
	
}
