package com.qsp.pract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice11 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//div[text()='Explore more']")).click();
	WebElement dropD = driver.findElement(By.xpath("//section[text()='Web Elements']"));
	//Select op=new Select(dropD);
	//op.selectByValue("Web Table");
	
}
}
