package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	driver.findElement(By.linkText("Audio")).click();
	//driver.findElement(By.linkText("Bluetooth Headphones")).click();
}
}
