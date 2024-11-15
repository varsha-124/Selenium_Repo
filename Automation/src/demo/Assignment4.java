package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Demo Web Shop"))
	{
		System.out.println("Welcome page displayed.");
	}
	else
		System.out.println("Welcome page not displayed");
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.id("")).click();
		Set<String> window=driver.getWindowHandles();
		System.out.println(window);
		
}
}
