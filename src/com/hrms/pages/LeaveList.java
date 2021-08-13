package com.hrms.pages;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.utility.*;

public class LeaveList extends BaseClass {
	public static void Leave() throws Exception{
		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveList']")).click();
		WebElement element=driver.findElement(By.xpath("//a[@class='toggle tiptip']"));
		//Second step-
		//Use gettext method…we have store that text in a string
		//To store the text of a WebElement in a string
		Thread.sleep(3000);
		String text=element.getText();

		//For printing the text in console output
		System.out.println("Text Obtained is "+text);


		//For verification use if else (conditional statements)

		if(text.contains("Leave Details"))
		{
			System.out.println("Expected text is obtained");

		}else
		{
			System.out.println("Expected text is not obtained");
		}
		Thread.sleep(3000);
		WebElement dateBox = driver.findElement(By.xpath("//input[@id='calFromDate']"));

		//Fill date as mm/dd/yyyy as 09/25/2013
		dateBox.clear();
		dateBox.sendKeys("2021-05-01");
		WebElement dateBox1 = driver.findElement(By.xpath("//input[@id='calToDate']"));

		//Fill date as mm/dd/yyyy as 09/25/2013
		dateBox1.clear();
		dateBox1.sendKeys("2021-05-01");

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='leaveList_txtEmployee_empName']")).sendKeys("Alice Duval");
		WebDriverWait wait=new WebDriverWait(driver,5000);// here time is given
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='leaveList_cmbWithTerminated']"))));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='leaveList_cmbWithTerminated']")).click();
		Thread.sleep(3000);

	}
}
