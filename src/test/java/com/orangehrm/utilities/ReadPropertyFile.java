package com.orangehrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.orangehrm.genericscripts.I_ApplicationConstants;

public class ReadPropertyFile implements I_ApplicationConstants
{
	public static String readData(String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propertyPath);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(Key);
	}
}
