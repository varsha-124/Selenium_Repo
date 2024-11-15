package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeFlipkartAndPassData {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/111");
	Thread.sleep(20000);
	String parentId = driver.getWindowHandle();
	driver.findElement(By.id("compare")).click();
	Set<String> ids = driver.getWindowHandles();
	for(String id:ids)
	{
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("flipkart"))
		{
			break;
		}
	}
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("mobiles");
	driver.close();
	driver.switchTo().window(parentId);
	driver.findElement(By.id("log in"));
}
}
