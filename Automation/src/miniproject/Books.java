package miniproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class Books extends BaseClass{
@Test
public void book()
{
	driver.findElement(By.linkText("Books")).click();
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Books page not displayed");
	Reporter.log("Books page displayed",true);
}

}
