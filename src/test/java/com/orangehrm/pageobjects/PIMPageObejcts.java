package com.orangehrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utilities.PageInitializer;

public class PIMPageObejcts extends PageInitializer
{
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmpBtn;
	
	@FindBy(name="firstName")
	private WebElement fnTf;
	
	@FindBy(name="middleName")
	private WebElement mnTf;
	
	@FindBy(name="lastName")
	private WebElement lnTf;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveBtn;
	
	public PIMPageObejcts(WebDriver driver)
	{
		//PageFactory.initElements(driver,this);
		super(driver);
	}
	
	public void addEmpBtn()
	{
		addEmpBtn.click();
	}
	
	public void enterFnTf(String fn)
	{
		fnTf.sendKeys(fn);
	}
	
	public void clearFnTf()
	{
		fnTf.clear();;
	}
	
	public void enterMnTf(String mn)
	{
		mnTf.sendKeys(mn);
	}
	
	public void clearMnTf()
	{
		mnTf.clear();
	}
	
	public void enterLnTf(String ln)
	{
		lnTf.sendKeys(ln);
	}
	
	public void clearLnTf()
	{
		lnTf.clear();
	}
	
	public void saveBtn()
	{
		saveBtn.click();
	}
}
