package com.orangehrm.runnerscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.genericscripts.BasePage;

public class TestRunnerForFailTest extends BasePage
{
	//@Test(dataProvider = "UserData", dataProviderClass = ReadExcel.class)
	@Test
	public void createEmployee()
	{
		db.pimBtn(); //Clicks on PIM button
		pim.addEmpBtn(); //Clicks on addemp button
		pim.enterFnTf("Shobhith");
		pim.enterMnTf("Jois");
		pim.enterLnTf("Lakshminarayan");
		pim.saveBtn();//Clicks on Save button
		System.out.println("Runner");
		Assert.fail();
	}
}
