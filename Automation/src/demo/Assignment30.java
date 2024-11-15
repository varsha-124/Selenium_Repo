package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment30 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://petdiseasealerts.org/forecast-map/#/");
	WebElement map = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
	driver.switchTo().frame(map);
	Actions act=new Actions(driver);
	driver.findElement(By.cssSelector("g[id='montana']")).click();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	driver.findElement(By.partialLinkText("SIGN UP")).click();
	driver.findElement(By.id("user")).sendKeys("mendonvarsha10@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("123456abcd");
	driver.findElement(By.id("cpass")).sendKeys("123456abcd");
	driver.findElement(By.id("firstName")).sendKeys("Riya");
	driver.findElement(By.id("lastName")).sendKeys("Benny");
	WebElement user = driver.findElement(By.id("user-type"));
	Select u=new Select(user);
	u.selectByIndex(2);
	driver.findElement(By.id("accept-tou")).click();
	driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	WebElement msg = driver.findElement(By.xpath("//b[text()='Thank you for registering!']"));	
	System.out.println(msg.getText());
}
}
