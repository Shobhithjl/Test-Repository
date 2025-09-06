package com.orangehrm.obj_utilities;

import java.util.List;

import org.openqa.selenium.WebElement;

public class DropDown 
{
	static WebElement Option;
	static List<WebElement> ListOfOptions;
	//selectOptions
	
	public static void selectDropdown(WebElement element, Object val)
	{
		if(val instanceof String)
		{
			try
			{
				Objects_Utilities.HandlingDropdown(element).selectByValue((String) val);
			}
			catch(Exception e)
			{
				Objects_Utilities.HandlingDropdown(element).selectByVisibleText((String) val);
			}
		}
		else if(val instanceof Integer)
		{
			Objects_Utilities.HandlingDropdown(element).selectByIndex((int) val);
		}
	}
		
    //deselectOptions
	public static void deSelect(WebElement element)
	{
		Objects_Utilities.HandlingDropdown(element).deselectAll();
	}

    public static void deSelect(WebElement element, Object val)
    {
    	if(val instanceof String)
    	{
    	        try
    	        {
    		         Objects_Utilities.HandlingDropdown(element).deselectByValue((String) val);
    	        }
    	        catch(Exception e)
    	        {
    		         Objects_Utilities.HandlingDropdown(element).deselectByVisibleText((String) val);
    	        }
    	}
    	else if(val instanceof Integer)
    	{
    		Objects_Utilities.HandlingDropdown(element).deselectByIndex((int) val);
    	}
    }
    
    //fetchOptions
    //getOptions()
    //getFirstSelectedOption()
    //getAllSelectedOptions()
    public static void readOptions(WebElement element, String val)
    {
    	switch(val)
    	{
    	case "FirstSelected": Option = Objects_Utilities.HandlingDropdown(element).getFirstSelectedOption();
    	break;
    	case "AllSelected": ListOfOptions =Objects_Utilities.HandlingDropdown(element).getAllSelectedOptions();
    	break;
    	case "AllOptions": ListOfOptions =Objects_Utilities.HandlingDropdown(element).getOptions();
    	break;
    	
    	default:System.out.println("Invalid Input");
    	break;
    	}
    	}
}
