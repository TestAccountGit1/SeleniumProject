package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCases.BaseClass;

public class LoginPage extends BaseClass{
  
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtUserName']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement passWord;
	
			
}
