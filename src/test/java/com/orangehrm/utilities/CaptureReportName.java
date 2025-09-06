package com.orangehrm.utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orangehrm.genericscripts.BasePage;
import com.orangehrm.genericscripts.I_ApplicationConstants;

public class CaptureReportName extends BasePage implements I_ApplicationConstants
{
	public static String getReportName() throws Exception
	{
		
		String reportName = TimeStamp.CurrentTimeStamp()+".html";
		return reportName;
	}

}
