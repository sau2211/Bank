package com.internetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver ;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(name="uid")
	WebElement userName ;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
		
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
		
	}
	
	public void clickSubmit()
	{
		login.click();
	}
}
