package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/Users/SANJAYPATEL/Downloads/Compressed/selenium-java-3.11.0/geckodriver.exe");
        
	       WebDriver driver= new FirefoxDriver();
	       driver.get("http://www.gcrit.com/build3/create_account.php");
	       
	      boolean dispalyStatus= driver.findElement(By.name("newsletter")).isEnabled();
	       System.out.println(dispalyStatus);
	}

}
