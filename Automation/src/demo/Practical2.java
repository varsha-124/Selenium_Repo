package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practical2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	while(true)
	{
	try {
		driver.findElement(By.xpath("//div[text()='January 2025']/../..//p[text()='23']")).click();
		break;
	}
	catch(Exception e)
	{
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}
	}

}
}
