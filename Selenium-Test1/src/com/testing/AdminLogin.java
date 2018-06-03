package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[] args) {
		//intentiate gecko driver
		System.setProperty("webdriver.gecko.driver","C:/Users/SANJAYPATEL/Downloads/Compressed/selenium-java-3.11.0/geckodriver.exe");
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("http://www.gcrit.com/build3/admin");
        webDriver.findElement(By.name("username")).sendKeys("admin1");
        webDriver.findElement(By.name("password")).sendKeys("admin@123");
        webDriver.findElement(By.id("tdb1")).click();
        
        String url=webDriver.getCurrentUrl();
        if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
        	System.out.println("Admin Login Succesfull");
        }
        else{
        	System.out.println("Admin Login UnSuccesfull");
        }
        
       webDriver.close();
	}

}
