package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkillRary {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis=new FileInputStream("./testdata/skillrary.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	
	FileInputStream eis=new FileInputStream("./testdata/skillrary.xlsx");
	Workbook workbook = WorkbookFactory.create(eis);
	String fname = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String lname = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String email = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	String password = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	String confirmpassword=workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();	
	
	 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get(url);
	
	RegisterPage rp=new RegisterPage(driver);
	rp.getRegisterLink().click();
	
	rp.getFirstName().sendKeys(fname);
	rp.getLastName().sendKeys(lname);
	rp.getEmail().sendKeys(email);
	rp.getPassword().sendKeys(password);
	rp.getConfirmPassword().sendKeys(confirmpassword);
	rp.getRegisterButton().click();
	
	
	
}
}
