package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	//Page Factory-OR:
	
	@FindBy(name="username")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(linkText="Sign Up")
	WebElement signup;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;

}
