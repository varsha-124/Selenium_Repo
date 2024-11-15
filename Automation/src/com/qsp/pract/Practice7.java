package com.qsp.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 {
public static void main(String[] args) {
	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement username = driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("varsha");
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("123456");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	WebElement error = driver.findElement(By.id("validationMessage"));
	String errorMsg = error.getText();
	System.out.println(errorMsg);
	String colour = error.getCssValue("color");
	System.out.println(colour);
	
}


}
