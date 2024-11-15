package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment32 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert apopup = driver.switchTo().alert();
	System.out.println(apopup.getText());
	apopup.accept();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert cpopup = driver.switchTo().alert();
	cpopup.accept();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert ppopup = driver.switchTo().alert();
	ppopup.sendKeys("Mira");
	ppopup.accept();
	//driver.switchTo().frame("iframeResult");
	WebElement msg = driver.findElement(By.id("demo"));
	System.out.println(msg.getText());
}
}
