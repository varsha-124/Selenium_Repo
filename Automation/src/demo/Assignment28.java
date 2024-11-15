package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment28 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	driver.get("https://demoapp.skillrary.com/");;
	WebElement search = driver.findElement(By.id("navbar-search-input"));
	search.sendKeys("Selenium",Keys.ENTER);
	driver.findElement(By.linkText("Selenium")).click();
	Actions act=new Actions(driver);
	act.moveByOffset(220, 504).perform();
	act.doubleClick().perform();
	//act.doubleClick().perform();
	}
}
