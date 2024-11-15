package miniproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import listeners.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class Computer extends BaseClass{
	@Test
	public void computers()
	{
		driver.findElement(By.linkText("Computers")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","Computer page not displayed");
		Reporter.log("Computers page displayed",true);
		
	}

}
