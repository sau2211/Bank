package com.internetbanking.pageObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {

	WebDriver driver ;
	
	public NewCustomer(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(xpath="//ul[@class=\"menusubnav\"]/li[2]")
	WebElement customerName ;
	
	@FindBy(xpath="//input[@name=\"name\"]")
	WebElement customerName1;
	
	@FindBy(xpath="//table[@class=\"layout\"]/tbody/tr/td/table/tbody/tr[5]/td/input[1]")
	WebElement gender;
	
	
	@FindBy(xpath="//input[@id=\"dob\"]")
	WebElement calendar;
	
	@FindBy(xpath = "//*[@name=\"addr\"]")
	WebElement address;
	
	@FindBy(xpath="//input[@name=\"city\"]")
	WebElement city;
	
	@FindBy(xpath="//input[@name=\"state\"]")
	WebElement state;
	
	@FindBy(xpath="//input[@name=\"pinno\"]")
	WebElement pin;
	
	@FindBy(xpath="//input[@name=\"telephoneno\"]")
	WebElement mobileNumber;

	@FindBy(xpath="//input[@name=\"emailid\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement submit;
	
	public void clickCustomerName()
	{
		 customerName.click();
	}
	public void setCustomerName(String uname)
	{
		customerName1.sendKeys(uname);
		
	}
	
	public void setGenderName()
	{
		gender.click();
		
	}
	
	public void setCalendar(String calendar1)
	{
		 String filterDate = calendar1;
		 DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = dateFormatter.parse(filterDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calendar.sendKeys(dateFormatter.toString());
		
	}
	
	public void setAddress(String address1)
	{
		address.sendKeys(address1);
		
	}
	public void setCity(String city1)
	{
		city.sendKeys(city1);
		
	}
	
	public void setState(String state1)
	{
		state.sendKeys(state1);
		}
	
	public void setPin(String pin1)
	{
		pin.sendKeys(pin1);
		}
	
	public void setMobileNumber(String mobile)
	{
		mobileNumber.sendKeys(mobile);
		}
	public void setEmail(String email1)
	{
		email.sendKeys(email1);
		}
	
	public void setPassword(String password1)
	{
		password.sendKeys(password1);
		}
	public void clickCustomerInformation()
	{
		 submit.click();
	}
	
}
