package takescreenshotlistener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass{
	@Test
public void login()
{
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("mendonvarsha11@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(driver.getTitle(),"Demo Web","Home page not displayed");
	
}
}
