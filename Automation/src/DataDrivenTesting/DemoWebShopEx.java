package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopEx {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./testdata/WebShopCommonData.properties");
	FileInputStream wis=new FileInputStream("./testdata/TestScriptData.xlsx");
	Properties prop=new Properties();
	prop.load(fis);
	Workbook workbook = WorkbookFactory.create(wis);
	String url = prop.getProperty("url");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	WelcomePage wp=new WelcomePage(driver);
	
	wp.getRegisterLink().click();
	//driver.get(url);
	String fname = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.id("FirstName")).sendKeys(fname);
	String lname = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.id("LastName")).sendKeys(lname);
	String email = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	driver.findElement(By.id("Email")).sendKeys(email);
	String password = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	driver.findElement(By.id("Password")).sendKeys(password);
	String cpassword = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
	driver.findElement(By.id("ConfirmPassword")).sendKeys(cpassword);
	//driver.findElement(By.id("register-button")).click();
	wp.getRegisterButton().click();
	
}
}
