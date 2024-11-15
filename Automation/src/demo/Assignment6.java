package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demoapp.skillrary.com/");
	driver.findElement(By.partialLinkText("SIGNUP")).click();
	String url = driver.getCurrentUrl();
	if(url.equals("https://demoapp.skillrary.com/login.php?type=register"))
	{
	System.out.println("Register page displayed.");
	}
	else
		System.out.println("Register page not displayed");
	driver.findElement(By.name("firstname")).sendKeys("Varsha");
	driver.findElement(By.name("lastname")).sendKeys("V");
	driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("mendonvarsha11@gmail.com");
	driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Vastfrnds1!");
	driver.findElement(By.name("repassword")).sendKeys("Vastfrnds1!");
	//Thread.sleep(2000);
	driver.findElement(By.name("signup")).click();
	driver.navigate().back();
	String url1 = driver.getCurrentUrl();
	if(url1.equals("https://demoapp.skillrary.com/")) {
		System.out.println("Welcome page displayed");
	}
	else
		System.out.println("Not displayed");
}
}
