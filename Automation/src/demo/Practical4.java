package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practical4 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/reg");
	WebElement year = driver.findElement(By.id("year"));
	Select op=new Select(year);
	List<WebElement> allyears = op.getOptions();
	int totalYears = allyears.size();
	op.selectByIndex(totalYears-1);
	//System.out.println(totalYears);
}
}
