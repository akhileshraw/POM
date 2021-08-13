package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.AssignLeave;
import com.hrms.pages.LeaveList;
import com.hrms.pages.Login_Page;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TestCase_101 {
// Test case Steps
	@Test(enabled=false)
	public static void tc101() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		VerifyPage.verifyTitle("HRMS");
		Login_Page.login("Admin", "admin123");
		VerifyPage.verifyTitle("Orange HRM");
		BaseClass.closeApplication();
		
	}
	@Test(priority=1)
	public static void tc100() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		VerifyPage.verifyTitle("OrangeHRM");
		Login_Page.login("Admin", "admin123");
		VerifyPage.verifyTitle("Orange HRM");
		LeaveList.Leave();
		AssignLeave.Assign();
		BaseClass.closeApplication();
		
	}
}
