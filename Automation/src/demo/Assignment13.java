package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/21");
	Thread.sleep(30000);
	driver.findElement(By.id("compare")).click();
	 Set<String> ids = driver.getWindowHandles();
	 for(String id:ids)
	 {
		 driver.switchTo().window(id);
		String url=driver.getCurrentUrl();
		//System.out.println(url);
		//Point pos = driver.manage().window().getPosition();
		//System.out.println(pos);
		if(url.contains("flipkart"))
		{
			//driver.manage().window().getPosition();
			driver.manage().window().setPosition(new Point(800,250));
		}
		else if(url.contains("ebay"))
		{
			driver.manage().window().setPosition(new Point(10,250));
		}
	 }
}
}
