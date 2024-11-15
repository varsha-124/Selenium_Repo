package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultipleSelect {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/");
	
	WebElement PriceDropDown = driver.findElement(By.id("cars"));
	Select selectPrices=new Select(PriceDropDown);
	selectPrices.selectByIndex(0);
	selectPrices.selectByValue("99");
	selectPrices.selectByVisibleText("INR 300 - INR 399 ( 1 )");
	selectPrices.deselectAll();
}
}
