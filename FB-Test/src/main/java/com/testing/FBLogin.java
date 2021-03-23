package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBLogin {

	public static void main(String[] args) {
		//intentiate gecko driver
		System.setProperty("webdriver.gecko.driver","C:/Users/SANJAYPATEL/Downloads/Compressed/selenium-java-3.11.0/geckodriver.exe");
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.findElement(By.name("email")).sendKeys("xxxxx@gmail.com");
        webDriver.findElement(By.name("pass")).sendKeys("xxxxx");
        webDriver.findElement(By.id("loginbutton")).click();
        
        String url=webDriver.getCurrentUrl();
        if(url.equals("https://www.facebook.com/")){
        	System.out.println("Admin Login Succesfull");
        }
        else{
        	System.out.println("Admin Login UnSuccesfull");
        }
        
       webDriver.close();
	}

}
