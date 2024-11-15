package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	String title = driver.getTitle();
	if(title.contains("vtiger"))
	{
		System.out.println("Welcome page displayed");
	}
	WebElement username = driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("Testing");
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("Test@123");
	driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	
	
}
}
