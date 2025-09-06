package com.orangehrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utilities.PageInitializer;

public class DashboardPageObjects extends PageInitializer
{
	@FindBy(className = "oxd-userdropdown-tab")
	private WebElement profileMenu;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutOption;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PimBtn;
	
	public DashboardPageObjects(WebDriver driver) 
	{
		//PageFactory.initElements(driver,this);
		super(driver);
	}
	
	public void profileMenu()
	{
		profileMenu.click();
	}
	
	public void logoutoption()
	{
		logoutOption.click();
	}
	
	public void pimBtn()
	{
		PimBtn.click();
	}
}
