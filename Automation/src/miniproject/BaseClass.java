package miniproject;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	public static Workbook workbook;
	public static Properties prop;
	
	
@BeforeTest
public void data() throws IOException
{
	FileInputStream pis=new FileInputStream("./testdata/commondata.properties");
	//FileInputStream wis=new FileInputStream("./testdata/TestScriptData.xlsx");
	prop=new Properties();
	prop.load(pis);
	
	//workbook = WorkbookFactory.create(wis);
}

@Parameters("Browser")
@BeforeClass
public void launch(String browsername)
{   
	if(browsername.equals("chrome"))
	{
	driver=new ChromeDriver();
	}
	else if(browsername.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(prop.getProperty("demourl"));
}

@BeforeMethod
public void login()
{
	LoginPage lp=new LoginPage(driver);
	lp.getLoginLink().click();
	lp.getEmailTF().sendKeys(prop.getProperty("demoemail"));
	lp.getPassTF().sendKeys(prop.getProperty("demopass"));
	lp.getLoginBtn().click();
}

@AfterMethod
public void logout()
{
	LoginPage lp=new LoginPage(driver);
	lp.getLogoutBtn().click();
}

@AfterClass
public void close()
{
	driver.quit();
}
}
