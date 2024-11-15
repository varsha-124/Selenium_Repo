package com.qsp.pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.getTitle();
	driver.getCurrentUrl();
	driver.getPageSource();
	driver.manage().window().getSize();
	driver.manage().window().getPosition();
	driver.getWindowHandles();
	
}
}
