package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment23 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	WebElement msg = driver.findElement(By.xpath("//p[@class=\"content\"]"));
	System.out.println(msg.getText());
	WebElement login = driver.findElement(By.linkText("Log in"));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.invisibilityOf(msg));
	login.click();
	
	
}
}
