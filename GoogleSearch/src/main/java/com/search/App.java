package com.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.gecko.driver","C:/Users/SANJAYPATEL/Downloads/Compressed/selenium-java-3.11.0/geckodriver.exe");
        
       WebDriver driver= new FirefoxDriver();
       driver.get("https://accounts.google.com");    
       driver.findElement(By.id("email")).sendKeys("imsanzaypatel");
       
       driver.findElement(By.id("email")).clear();
     //driver.findElement(By.linkText("Gmail")).click();
   }
}
