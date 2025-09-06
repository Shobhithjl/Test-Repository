package com.orangehrm.runnerscripts;

import org.testng.annotations.Test;

import com.orangehrm.genericscripts.BasePage;

public class TestRunnerToClearTest extends BasePage
{
	@Test
	
	public void testCase2()
	{
		db.pimBtn(); //Clicks on PIM button
		pim.addEmpBtn(); //Clicks on addemp button
		pim.enterFnTf("Vidya");
		pim.clearFnTf();
		pim.enterMnTf("KL");
		pim.clearMnTf();
		pim.enterLnTf("Shree");
		pim.clearLnTf();
	}
}
