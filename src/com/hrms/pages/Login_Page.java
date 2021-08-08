package com.hrms.pages;
import com.hrms.utility.*;

import org.openqa.selenium.By;
import org.testng.Reporter;



public class Login_Page extends BaseClass{
	//obj
	static By txt_loginname= By.name("txtUsername");
	static By txt_password= By.name("txtPassword");
	static By btn_login= By.name("Submit");
	// Function
	public static void login(String un, String pw) throws Exception{
		driver.findElement(txt_loginname).sendKeys(un);
		driver.findElement(txt_password).sendKeys(pw);
		driver.findElement(btn_login).click();
		Thread.sleep(3000);
		Reporter.log("Login Completed");
		Log.info("Application Opened");
		
	}
}
