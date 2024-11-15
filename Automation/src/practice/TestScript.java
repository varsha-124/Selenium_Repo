package practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass {
	@Test(dataProvider="datas")
public void skillrary()
{
	driver.findElement(By.xpath("//span[text()='Sales']")).click();
	Assert.assertEquals(driver.getCurrentUrl(), "sales","Sales page not displayed");
	Reporter.log("Sales page displayed");
}
	
@DataProvider()
public String[][]datas()
{
	String data[][]= {
			{"admin","admin"},
			{"admin","ad"},
			{"ad","admin"},
			{"ad","ad"}
	};
	return data;
}
}
