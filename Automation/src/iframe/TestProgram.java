package iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TestProgram {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.vtiger.com/vtigercrm/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/vtiger.png");
	FileHandler.copy(temp, dest);
	driver.findElement(By.linkText("Vtiger")).click();
	Set<String> ids = driver.getWindowHandles();
	for(String id:ids)
	{
		driver.switchTo().window(id);
		String title = driver.getTitle();
		if(title.contains("CRM"))
			break;
	}
	Actions act=new Actions(driver);
	WebElement company = driver.findElement(By.linkText("Company"));
	act.moveToElement(company).perform();
	driver.findElement(By.linkText("Contact Us")).click();
	 WebElement contactno = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../..//p[contains(text(),'+91')]"));
	act.scrollToElement(contactno);
	String contact = contactno.getText();
	System.out.println(contact);
}
}
