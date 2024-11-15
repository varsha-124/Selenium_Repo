package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement subs = driver.findElement(By.id("newsletter-subscribe-button"));
	System.out.println(subs.isDisplayed());
	Rectangle pos = subs.getRect();
	System.out.println(pos.getHeight());
	System.out.println(pos.getWidth());
	System.out.println(pos.getX());
	System.out.println(pos.getY());
	
}
}
