package com.qsp.pract;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Facebook")).click();
	switchWindow(driver,"Flipkart");
	driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
	switchWindow(driver,"Sign up");
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("Varsha");
	
}
public static void switchWindow(WebDriver driver, String url)
{
	Set<String> ids = driver.getWindowHandles();
	for(String id:ids)
	{
	driver.switchTo().window(id);
	String acturl=driver.getCurrentUrl();
	if(acturl.contains(url))
	{
		break;
}
}
}
}
