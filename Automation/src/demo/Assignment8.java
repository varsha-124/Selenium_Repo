package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("varshaganiga01@gmail.com");
	driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Vastfrnds1!");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	Thread.sleep(2000);
	//driver.navigate().back();
	String url = driver.getCurrentUrl();
	//System.out.println(url);
	if(url.equals("https://demowebshop.tricentis.com/"))
			{
		System.out.println("Home page is displayed");
			}
	else
		System.out.println("Home page is not displayed");
}
}
