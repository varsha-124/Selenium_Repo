package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment25 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/nopCommerce");
	driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	Set<String> ids = driver.getWindowHandles();
	for(String id: ids)
	{
		driver.switchTo().window(id);
		String title=driver.getTitle();
		if(title.contains("Signup"))
			break;
	}
	WebElement yearD = driver.findElement(By.id("year"));
	Select year=new Select(yearD);
    int count = year.getOptions().size();
    System.out.println(count);
    year.selectByIndex(count-1);
}
}
