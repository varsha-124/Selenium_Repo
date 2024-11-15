package com.qsp.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.instagram.com/");
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("varshaganiga01@gmail.com");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Vastfrnds1!");
	//driver.findElement(By.xpath("//div[text()='Log in']")).click();
}
}
