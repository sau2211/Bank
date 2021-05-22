package com.internetbanking.testscript;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.NDC;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.internetbanking.pageObject.LoginPage;

import com.internetbanking.pageObject.NewCustomer;

public class LoginTest extends BaseClass {
	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		logger.info("base url is opened");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage lp = new LoginPage(driver);
		NewCustomer nc = new NewCustomer(driver);
		lp.setUserName(username);
		logger.info("username is entered");
		lp.setPassword(password);
		logger.info("password is entered");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		nc.clickCustomerName();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		nc.setCustomerName("saurabh");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		nc.setGenderName();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		nc.setCalendar("12-11-2019");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		nc.setAddress("144");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		nc.setCity("Noida");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		nc.setState("UP");
		
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		nc.setPin("201301");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);   
		
		nc.setMobileNumber("9910995563");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	nc.setEmail("sau2211@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		nc.setPassword("******");
		
		nc.clickCustomerInformation();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
//		{
//			logger.info("login test passed");
//			Assert.assertTrue(true);
//		}
//		
//		else
//		{
//			logger.info("login test failed");
//			Assert.assertTrue(false);}
//		
//	}
	
	}

}
