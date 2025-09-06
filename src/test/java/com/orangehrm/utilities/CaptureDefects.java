package com.orangehrm.utilities;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orangehrm.genericscripts.BasePage;
import com.orangehrm.genericscripts.I_ApplicationConstants;

public class CaptureDefects extends BasePage implements I_ApplicationConstants
{
	public static void getDefect(String fileName) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(screenShotsPath+fileName+" "+TimeStamp.CurrentTimeStamp()+".png");
        org.openqa.selenium.io.FileHandler.copy(temp, perm);		
	}

}
