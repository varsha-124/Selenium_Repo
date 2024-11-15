package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnCopyPaste {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement name = driver.findElement(By.id("FirstName"));
	Actions act=new Actions(driver);
	act.sendKeys(name,"John").perform();
	act.keyDown(Keys.CONTROL).keyDown("a");
	act.keyUp(Keys.CONTROL).keyUp("a");
	
}
}
