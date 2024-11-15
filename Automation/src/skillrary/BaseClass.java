package skillrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	
	@BeforeTest
	public void fetchData() throws IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		prop=new Properties();
		prop.load(fis);
	}
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
	driver.findElement(By.id("email")).sendKeys(prop.getProperty("skillemail"));
	driver.findElement(By.id("password")).sendKeys(prop.getProperty("skillpassword"));;
	driver.findElement(By.name("login")).click();
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
