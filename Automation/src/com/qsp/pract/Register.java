package com.qsp.pract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-female")).click();
	WebElement name = driver.findElement(By.id("FirstName"));
	Actions act=new Actions(driver);
	act.sendKeys(name,"Ayra").perform();
	act.keyDown(Keys.TAB).perform();
	act.keyUp(Keys.TAB).perform();
	act.sendKeys("Yash").perform();	
	act.keyDown(Keys.TAB).perform();
	act.keyUp(Keys.TAB).perform();
	act.sendKeys("varshaganiga01@gmail.com").perform();
}
}
