package assertion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AutomationExercise1 {
@Test
public void testCase2()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://automationexercise.com");
	Assert.assertEquals(driver.getTitle(),"Automation Exercise","Home page not displayed");
	Reporter.log("Home page is displayed",true);
	driver.findElement(By.linkText("Signup / Login")).click();
	Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed(),true);
	//Assert.assertEquals(res, true);
	Reporter.log("Login to your account Displayed",true);
	
	driver.findElement(By.name("email")).sendKeys("varshaganiga01@gmail.com");
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Assert.assertEquals(driver.findElement(By.xpath("//a[text()=' Logged in as ']")).isDisplayed(),true);
	Reporter.log("Logged in as username displayed",true);
	
	driver.findElement(By.linkText("Delete Account")).click();
	Assert.assertEquals(driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed(),true);
	Reporter.log("Account deleted",true);
	
	
}
}
