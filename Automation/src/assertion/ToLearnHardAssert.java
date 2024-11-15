package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
@Test
public void login()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Welcome page not displayed");
	Reporter.log("Welcome page displayed",true);
	
	driver.findElement(By.linkText("Log in")).click();
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login page is not displayed");
	Reporter.log("Login page is displayed",true);
	
	driver.findElement(By.id("Email")).sendKeys("mendonvarsha11@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not displayed");
	Reporter.log("Home page is displayed",true);
	
	
}
}
