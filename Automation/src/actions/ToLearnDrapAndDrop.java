package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnDrapAndDrop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement pics = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(pics);
	WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	WebElement trash = driver.findElement(By.id("trash"));
	Actions act=new Actions(driver);
	act.dragAndDrop(image1, trash).perform();
	act.dragAndDrop(image2, trash).perform();
	act.dragAndDrop(image4, trash).perform();
	WebElement gallery = driver.findElement(By.id("gallery"));
	act.pause(2000);
	act.dragAndDrop(image1, gallery).perform();
	act.dragAndDrop(image2, gallery).perform();
	act.dragAndDrop(image4, gallery).perform();
	
}
}
