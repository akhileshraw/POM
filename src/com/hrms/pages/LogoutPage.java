package com.hrms.pages;
import com.hrms.utility.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.openqa.selenium.support.ui.Select;
public class LogoutPage extends BaseClass {
	static By link_logout= By.linkText("Logout");
	//Fun	
	public static void logout() throws Exception {
		 driver.findElement(By.xpath("//*[@id='welcome']")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 System.out.println("CLicked on Welcome");
		 driver.findElement(By.linkText("Logout")).click();
		 System.out.println("CLicked on LogOut");
		 Thread.sleep(3000);
		
	}

}
