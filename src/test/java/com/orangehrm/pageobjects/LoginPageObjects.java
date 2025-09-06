package com.orangehrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utilities.PageInitializer;

public class LoginPageObjects extends PageInitializer
{
	@FindBy(name="username")
	private WebElement usnTf;
	
	@FindBy(name="password")
	private WebElement pswTf;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	public LoginPageObjects(WebDriver driver) 
	{
		//PageFactory.initElements(driver,this);
		super(driver);
	}
	
	public void enterUsn(String usn)
	{
		usnTf.sendKeys(usn);
	}
	
	public void enterPsw(String psw)
	{
		pswTf.sendKeys(psw);
	}
	
	public void clickLoginbtn()
	{
		loginBtn.click();
	}
	

}
