package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment33 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://www.abhibus.com/");
	driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
	//driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
	int count=0;
	while(true)
	{
		try {
	driver.findElement(By.xpath("//span[text()='January']/../../..//span[text()='2']")).click();
	break;
		}
		catch(Exception e)
		{
			if(count==0)
			{
				driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
			}
	driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();
		}
	}
}
}
