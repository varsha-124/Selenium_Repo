package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment24 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.freshersworld.com/");
	driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
	if(title.contains("Register in Just 2 Minutes"))
	{
		System.out.println("Register page displayed");
	}
	WebElement drop = driver.findElement(By.id("currentCity"));;
	Select city=new Select(drop);
	city.selectByVisibleText(" Mangalore");
	WebElement courseDrop = driver.findElement(By.id("course"));
	Select course=new Select(courseDrop);
	course.selectByValue("16");
}
}
