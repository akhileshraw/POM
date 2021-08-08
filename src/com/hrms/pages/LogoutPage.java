package com.hrms.pages;
import com.hrms.utility.*;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class LogoutPage extends BaseClass {
	static By link_logout= By.linkText("Logout");
	//Fun	
	public static void logout() {
		driver.findElement(link_logout).click();
		Reporter.log("Logout Completed");
	}

}
