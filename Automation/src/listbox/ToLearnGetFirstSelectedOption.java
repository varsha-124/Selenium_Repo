package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetFirstSelectedOption {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapp.skillrary.com/");
	WebElement priceDropDown = driver.findElement(By.id("cars"));
	Select price=new Select(priceDropDown);
	price.selectByIndex(0);
	price.selectByIndex(1);
	price.selectByIndex(2);
	WebElement first = price.getFirstSelectedOption();
	System.out.println(first.getText());
	List<WebElement> all = price.getAllSelectedOptions();
	for(WebElement singleValue: all)
	{
		System.out.println(singleValue.getText());
	}
}
}
