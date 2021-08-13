package com.hrms.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.*;
public class AddEmployee extends BaseClass {

	public static void addEmp() throws Exception{
		Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
        Thread.sleep(3000);
        Reporter.log("MouseOver Completed");
        driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);
	}
	
	
		
	
}
