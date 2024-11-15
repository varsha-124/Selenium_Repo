package listenersP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass{
@Test
public void users()
{
	driver.findElement(By.xpath("//span[text()='Users']")).click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://demoapp.skillrary.com/admin/user.php", "Users page not displayed");
	Reporter.log("Users page displayed",true);
}

}
