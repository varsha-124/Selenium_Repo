import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("varshaganiga01@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Vastfrnds1!");
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//a[contains(text(),'inch Laptop')]/../..//input[@value=\"Add to cart\"]")).click();
	
	
}
}

