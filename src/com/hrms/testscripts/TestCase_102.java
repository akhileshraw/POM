package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.AddEmployee;
import com.hrms.pages.Login_Page;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;


public class TestCase_102 {

	@Test
	public static void tc101() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		VerifyPage.verifyTitle("HRMS");
		Login_Page.login("Admin", "admin123");
		VerifyPage.verifyTitle("Orange HRM");
		//AddEmployee.addEmp();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}
}
