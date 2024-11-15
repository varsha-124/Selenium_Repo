package crossbrowser;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssignmentScript extends BaseClass{
@Test
public void sales()
{
	driver.findElement(By.xpath("//span[text()='Sales']")).click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://demoapp.skillrary.com/admin/sales.php","Sales History page not displayed");
	Reporter.log("Sales History page displayed",true);

}
}
