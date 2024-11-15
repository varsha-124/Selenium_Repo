package skillrary;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
@Test
public void sales()
{
	//Alert popup=driver.switchTo().alert();
	//popup.accept();
	driver.findElement(By.xpath("//span[text()='Sales']")).click();
	String url = driver.getCurrentUrl();
	if(url.contains("sales.php"))
		Reporter.log("Sales History is displayed",true);
	else
		Reporter.log("Sales history is not displayed",true);
}


}
