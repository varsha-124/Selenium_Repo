package miniproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class Electronics extends BaseClass{
	@Test
	public void electronics()
	{
		driver.findElement(By.linkText("Electronics")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Tricentis","Electronics page not displayed");
		Reporter.log("Electronics page displayed",true);
	}
}
