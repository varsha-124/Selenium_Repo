package listenersP;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
public static Properties prop;
public static WebDriver driver;


@BeforeTest
public void data() throws IOException
{
	FileInputStream fis=new FileInputStream("./testdata/skillrary.properties");
	prop=new Properties();
	prop.load(fis);
	
}
	
@BeforeClass
public void launch()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(prop.getProperty("url"));
}

@BeforeMethod
public void login()
{
	LoginPage lp=new LoginPage(driver);
	lp.getLoginLink().click();
	lp.getEmailTF().sendKeys(prop.getProperty("email"));
	lp.getPassTF().sendKeys(prop.getProperty("password"));
	lp.getLoginButton().click();
}

@AfterMethod
public void logout()
{
	LogoutPage lop=new LogoutPage(driver);
	lop.getLogoutLink().click();
	lop.getLogoutBtn().click();
}

@AfterClass
public void close()
{
	driver.quit();
}

}
