package com.qsp.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice10 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	//driver.findElement(By.xpath("//p[text()='UI Testing Concepts']/../..//div[text()='Explore more']")).click();
	WebElement image = driver.findElement(By.tagName("img"));
	System.out.println(image.getText());
}
}
