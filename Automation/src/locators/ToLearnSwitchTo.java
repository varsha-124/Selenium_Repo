package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/18");
	Thread.sleep(20000);
	driver.findElement(By.id("compare")).click();
	Set<String> ids = driver.getWindowHandles();
	for(String id:ids)
	{
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("ebay"))
			break;
	}
	String curl = driver.getCurrentUrl();
	System.out.println(curl);
	
	
	
}
}
