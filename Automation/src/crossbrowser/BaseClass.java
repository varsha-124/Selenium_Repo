package crossbrowser;

import java.time.Duration;
import java.util.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	@Parameters("Browser")
	
	@BeforeTest
	public void launch(@org.testng.annotations.Optional("chrome") String browsername)
	{
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equals("edge")) {
			driver=new EdgeDriver();
		}
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
	driver.findElement(By.id("last")).click();
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

/*@DataProvider
public String[][] loginData()
{
	String data[][]= {
			{"admin","admin"}
	};
	return data;
}*/
}
