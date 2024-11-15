package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnSingleSelect {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/reg/?next=%2nopCommerce");
	WebElement monthDropDown = driver.findElement(By.id("month"));
	Select monthSelect=new Select(monthDropDown);
	monthSelect.selectByIndex(6);
	monthSelect.deselectByIndex(6);
	WebElement yearDropDown = driver.findElement(By.id("year"));
	Select selectYear=new Select(yearDropDown);
	selectYear.selectByValue("1999");
	WebElement dayDropDown = driver.findElement(By.id("currentCity"));
	Select selectDay=new Select(dayDropDown);
	selectDay.selectByVisibleText("21");

	
}
}
