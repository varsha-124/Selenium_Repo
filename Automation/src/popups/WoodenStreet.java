package popups;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WoodenStreet {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.woodenstreet.com/");
	driver.findElement(By.id("loginclose1")).click();
	WebElement sofas = driver.findElement(By.xpath("//a[text()='Sofas']"));
	Actions act=new Actions(driver);
	act.moveToElement(sofas).perform();
	sofas.click();
	driver.findElement(By.linkText("Wooden Sofas")).click();
	//Set<String> ids = driver.getWindowHandles();
	WoodenStreet.addProduct(driver,"product");
	driver.findElement(By.xpath("//h3[text()='Winster 3 Seater Wooden Sofa (Honey Irish Cream)']")).click();
	driver.findElement(By.id("button-cart-buy-now")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Study & Office")).click();
	WoodenStreet.addProduct(driver,"study");
	driver.findElement(By.linkText("Office Tables")).click();
	driver.findElement(By.xpath("//h3[text()='Elif Executive Table (Exotic Teak-Frosty White Finish)']")).click();
	driver.findElement(By.id("button-cart-buy-now")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Living")).click();
	WoodenStreet.addProduct(driver,"living");
	driver.findElement(By.linkText("TV Units")).click();
	driver.findElement(By.xpath("//h3[contains(text(),'Jett Metal Base Sheesham Wood Tv Unit with Drawers and Cabinets ')]")).click();
	driver.findElement(By.id("button-cart-buy-now")).click();
	driver.findElement(By.xpath("//a[@title='Cart']")).click();
	List<WebElement> items = driver.findElements(By.xpath("//p[text()=' Coupon Applied']"));
	System.out.println(items.size());
	List<WebElement> prices = driver.findElements(By.xpath("//strong[contains(text(),'Rs')]"));
	//List <WebElement> details = driver.findElements(By.xpath("//div[@class='product-detail']"));
	List<WebElement> remove = driver.findElements(By.xpath("//p[@title='Remove']"));
	TreeSet<String>s=new TreeSet<String>();
	for(WebElement price:prices)
	{
		String p = price.getText();
		s.add(p);
	}
	String highest = s.last();
	driver.findElement(By.xpath("//strong[text()='"+highest+"']/../..//p[@title='Remove']")).click();
	

}
public static void addProduct(WebDriver driver,String prod)
{
	Set<String> ids = driver.getWindowHandles();
	for(String id:ids)
	{
		driver.switchTo().window(id);
		String url=driver.getCurrentUrl();
		if(url.contains(prod))
				break;
	}

	
}
}
