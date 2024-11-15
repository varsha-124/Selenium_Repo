package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment {
@Test(dataProviderClass = AssignmentData.class,dataProvider = "login")
public void login(String[] cred)
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.id("Email")).sendKeys(cred[0]);
driver.findElement(By.id("Password")).sendKeys(cred[1]);
driver.findElement(By.xpath("//input[@value='Log in']")).click();
Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Login not successful");
Reporter.log("Login Successful");

}
}