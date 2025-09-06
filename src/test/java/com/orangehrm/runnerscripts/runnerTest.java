package com.orangehrm.runnerscripts;

import org.testng.annotations.Test;

import com.orangehrm.genericscripts.BasePage;
import com.orangehrm.utilities.ReadExcel;

public class runnerTest extends BasePage
{
	@Test(dataProvider = "UserData", dataProviderClass = ReadExcel.class)
	public void testcase(String fn, String mn, String ln)
	{
		db.pimBtn(); //Clicks on PIM button
		pim.addEmpBtn(); //Clicks on addemp button
		pim.enterFnTf(fn);
		pim.enterMnTf(mn);
		pim.enterLnTf(ln);
		pim.saveBtn();//Clicks on Save button
		System.out.println("Runner");
	}
}
