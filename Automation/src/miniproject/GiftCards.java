package miniproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class GiftCards extends BaseClass{
	@Test
	public void electronics()
	{
		driver.findElement(By.linkText("Gift Cards")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Tricentis","Gift card page not displayed");
		Reporter.log("GiftCard page displayed",true);
	}
}

