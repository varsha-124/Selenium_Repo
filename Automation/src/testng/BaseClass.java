package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
public WebDriver driver;
public Properties prop;
public Workbook workbook;

@BeforeTest
public void fetchData() throws IOException
{
	FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
	prop=new Properties();
	prop.load(fis);
	
	FileInputStream efis=new FileInputStream("./testdata/TestScriptData.xlsx");
	workbook = WorkbookFactory.create(efis);
}
@Parameters("Browser")
@BeforeClass
public void launch(String browsername)
{
	//String browsername="chrome";
	if(browsername.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browsername.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(prop.getProperty("url1"));
}

@BeforeMethod
public void login()
{
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email1"));
	driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password1"));
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
}


@AfterMethod
public void logout()
{
	driver.findElement(By.linkText("Log out")).click();
}

@AfterClass
public void close()
{
	driver.quit();
}

@AfterTest
public void closeObject() throws IOException
{
	workbook.close();
}

}
