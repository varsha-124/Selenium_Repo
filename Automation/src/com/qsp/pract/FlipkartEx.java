package com.qsp.pract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEx {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	WebElement value = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
	String v = value.getAttribute("placeholder");
	System.out.println(v);
}
}
