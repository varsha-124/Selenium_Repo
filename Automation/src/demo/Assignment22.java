package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment22 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	//driver.get("https://demoapps.qspiders.com/");
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	//driver.findElement(By.xpath("(//div[text()='Explore more'])[1]")).click();
	//driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
	driver.findElement(By.xpath("//section[text()='Web Table']")).click();
	driver.findElement(By.linkText("Dynamic Web Table")).click();
	String price = driver.findElement(By.xpath("//th[text()='Apple iPhone']/following-sibling::td[4]")).getText();
	System.out.println(price);
	TakesScreenshot ts= (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/webpage.png");
	FileHandler.copy(temp, dest);
		
}
}
