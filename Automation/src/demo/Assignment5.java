package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Varsha");
	driver.findElement(By.id("LastName")).sendKeys("Vasudeva");
	driver.findElement(By.id("Email")).sendKeys("varshaganiga01@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Vastfrnds1!");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Vastfrnds1!");
	driver.findElement(By.id("register-button")).click();
}
}
