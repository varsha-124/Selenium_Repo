package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapp.skillrary.com/");
	WebElement priceDropDown = driver.findElement(By.id("cars"));
	Select price=new Select(priceDropDown);
	List<WebElement> allPrices = price.getOptions();
	System.out.println(allPrices.size());                                                                                                                                                                
	for(WebElement prices:allPrices)
	{
		System.out.println(prices.getText());
	}
}
}
