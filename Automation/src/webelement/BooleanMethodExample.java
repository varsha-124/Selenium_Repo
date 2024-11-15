package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethodExample {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Create new account")).click();
	try {
	WebElement gender = driver.findElement(By.id("custom_gender"));
	gender.isDisplayed();
	}
	catch(Exception e)
	{
		System.out.println("Not displayed");
	}
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
	WebElement gender = driver.findElement(By.id("custom_gender"));
	System.out.println(gender.isDisplayed());
	
	
	
	
}
}
