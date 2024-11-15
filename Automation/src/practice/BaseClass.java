package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
@BeforeClass
public void launch()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapp.skillrary.com/");
}

@BeforeMethod
public void login()
{
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
}

@AfterMethod
public void logout()
{
	driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
	driver.findElement(By.linkText("Sign out")).click();
}


@AfterClass
public void close()
{
	driver.quit();
}
}
