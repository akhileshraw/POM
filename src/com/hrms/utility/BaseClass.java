package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
public class BaseClass {
 public static WebDriver driver;
 public static void openApplication() {
	 System.setProperty("webdriver.gecko.driver","E:\\Driver\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	 Reporter.log("Application Opened");	 
 }
 public static void closeApplication() {
	 driver.quit();
	 Reporter.log("Application Closed");
 }
}
