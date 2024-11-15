package com.qsp.pract;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingEx {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.shoppersstack.com/products_page/17");
	driver.findElement(By.id("compare")).click();
	Thread.sleep(20000);
	Set<String> ids = driver.getWindowHandles();
	for(String id:ids)
	{
		driver.switchTo().window(id);
		String title=driver.getTitle();
		if(title.contains("Online Shopping"))
			break;
	}
	driver.manage().window().setPosition(new Point(150,150));
}
}
