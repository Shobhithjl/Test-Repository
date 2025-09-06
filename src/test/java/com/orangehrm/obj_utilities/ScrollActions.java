package com.orangehrm.obj_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollActions 
{
	public static void scollIntoElement(WebDriver driver,WebElement ele)
	{
		Objects_Utilities.JavaScriptExecutor(driver).executeScript("arguments[0].scrollIntoView()",ele);
	}
	
	public static void scrollIntoElement(WebDriver driver,WebElement ele,int x, int y)
	{
		Objects_Utilities.JavaScriptExecutor(driver).executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static void scrollBottomOfPage(WebDriver driver)
	{
		Objects_Utilities.JavaScriptExecutor(driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public static void scrollTopOfPage(WebDriver driver)
	{
		Objects_Utilities.JavaScriptExecutor(driver).executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
