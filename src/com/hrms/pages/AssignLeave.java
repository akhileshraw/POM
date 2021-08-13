package com.hrms.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utility.BaseClass;
import org.openqa.selenium.support.ui.Select;

public class AssignLeave extends BaseClass{
	public static void Assign() throws Exception{
driver.findElement(By.xpath("//a[@id='menu_leave_assignLeave']")).click();
driver.findElement(By.xpath("//input[@id='assignleave_txtEmployee_empName']")).sendKeys("Paul Collings");
Select st=new Select(driver.findElement(By.name("assignleave[txtLeaveType]")));
st.selectByVisibleText("CAN - Personal");// 
Thread.sleep(3000);
WebElement dateBox = driver.findElement(By.xpath("//input[@id='assignleave_txtFromDate']"));

//Fill date as mm/dd/yyyy as 09/25/2013
dateBox.clear();
dateBox.sendKeys("2021-08-13");
WebElement dateBox1 = driver.findElement(By.xpath("//input[@id='assignleave_txtToDate']"));

//Fill date as mm/dd/yyyy as 09/25/2013
dateBox1.clear();
dateBox1.sendKeys("2021-08-14");

Robot r=new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(3000);
Select st1=new Select(driver.findElement(By.xpath("//select[@id='assignleave_partialDays']")));
st1.selectByVisibleText("All Days");//
driver.findElement(By.xpath("//textarea[@id='assignleave_txtComment']")).sendKeys("I am going for Party");
driver.findElement(By.id("assignBtn")).click();
Thread.sleep(3000);
	}
}
