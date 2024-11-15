package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnHiddenDivisionPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@data-cy=\'closeModal\']")).click();
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	//while(true)
	for(;;)
	{
		try
		{
			driver.findElement(By.xpath("//div[text()='July 2025']/../..//p[text()='21']")).click();
			break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
	}
}
}
