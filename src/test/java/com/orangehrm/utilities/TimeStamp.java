package com.orangehrm.utilities;

import sun.util.calendar.BaseCalendar.Date;

public class TimeStamp 
{
	public static String CurrentTimeStamp()
	{
		java.util.Date date = new java.util.Date();
		String formatDate = date.toString();
		String actualDate = formatDate.replace(":","-");
		return actualDate;
	}
}
