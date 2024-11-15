package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement username = driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("varsha123");
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("123456");
}
}
