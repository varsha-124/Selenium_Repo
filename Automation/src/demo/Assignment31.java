package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment31 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement gallery = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(gallery);
	WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement trash = driver.findElement(By.id("trash"));
	Actions act=new Actions(driver);
	act.dragAndDrop(image1, trash).perform();
	act.dragAndDrop(image2, trash).perform();
	driver.switchTo().defaultContent();
	driver.findElement(By.partialLinkText("CHEATSHEETS")).click();
	//WebElement ad = driver.findElement(By.xpath("//div[@id='ad_position_box']"));
	driver.switchTo().frame("aswift_5");
	driver.findElement(By.xpath("//div[@role='button']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("SQL Cheat Sheet")).click();
	Set<String> ids = driver.getWindowHandles();
	for(String id:ids)
	{
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("sql-cheat-sheet"))
			break;
	}
	//WebElement joinAd = driver.findElement(By.xpath("(//img[contains(@class,'wp-block-jetpack-slideshow_image wp-image')])[7]"));
	WebElement joinAd = driver.findElement(By.xpath("(//img[@data-id='6452'])[1]"));
	//driver.switchTo().frame(joinAd);
	act.scrollToElement(joinAd).perform();
	TakesScreenshot ts=(TakesScreenshot)driver;
    File temp = ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("./screenshots/sql.png");
    FileHandler.copy(temp, dest);
	
}
}
