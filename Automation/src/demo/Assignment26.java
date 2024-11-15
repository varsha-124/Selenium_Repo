package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment26 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("(//div[text()='Explore more'])[1]")).click();
	driver.findElement(By.linkText("Button")).click();
	driver.findElement(By.linkText("Right Click")).click();
	WebElement rightButton = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
	Actions act=new Actions(driver);
	act.contextClick(rightButton).perform();
	driver.findElement(By.xpath("//div[text()='Yes']")).click();
	WebElement sucessMsg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
	System.out.println(sucessMsg.getText());
	System.out.println(sucessMsg.getCssValue("color"));
	
}
}
