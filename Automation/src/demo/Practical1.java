package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practical1 {
public static void main(String[] args) throws MalformedURLException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	//driver.get("https://www.shoppersstack.com/");
	//driver.navigate().to("https://www.shoppersstack.com/");
	driver.navigate().to(new URL("https://www.shoppersstack.com/"));
	WebElement women = driver.findElement(By.id("women"));
	Actions act=new Actions(driver);
	act.moveToElement(women).perform();
	driver.findElement(By.linkText("KURTAS & SUITS")).click();
	
}
}
