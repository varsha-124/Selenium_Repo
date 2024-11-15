package demo;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment14 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/21");
	Thread.sleep(30000);
	driver.findElement(By.id("compare")).click();
	switchWindow(driver,"flipkart");
	Point flipkartPosition = driver.manage().window().getPosition();
	switchWindow(driver,"ebay");
	Point ebayPosition = driver.manage().window().getPosition();
	driver.manage().window().setPosition(flipkartPosition);
	switchWindow(driver,"flipkart");
	driver.manage().window().setPosition(ebayPosition);
	
}
private static void switchWindow(WebDriver driver, String url)
{
	Set<String> ids = driver.getWindowHandles();
	for(String id:ids)
	{
		driver.switchTo().window(id);
		String actUrl=driver.getCurrentUrl();
		if(actUrl.contains(url))
		{
			break;
		}
	}
}
}


