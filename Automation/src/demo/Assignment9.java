package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("varshaganiga01@gmail.com");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Vastfrnds1!");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	String title = driver.getTitle();
	if(title.equals("Demo Web Shop"))
	{
		System.out.println("Home page displayed");
	}
	else
		System.out.println("Home page is not displayed");
}
}
