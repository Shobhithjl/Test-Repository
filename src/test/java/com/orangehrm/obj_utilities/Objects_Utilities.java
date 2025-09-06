package com.orangehrm.obj_utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Objects_Utilities 
{
	public static Actions MouseActions(WebDriver driver)
	{
		return new Actions(driver);
	}
	
	public static Select HandlingDropdown(WebElement dropdownElement)
	{
		return new Select(dropdownElement);
	}
	
	public static JavascriptExecutor JavaScriptExecutor(WebDriver driver)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		return js;
	}
}
