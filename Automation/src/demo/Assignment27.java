package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment27 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String time = LocalDateTime.now().toString().replace(":", "-");
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']/..//div[text()='Explore more']")).click();
	driver.findElement(By.linkText("Button")).click();
	driver.findElement(By.linkText("Double Click")).click();
	WebElement yesButton = driver.findElement(By.id("btn20"));
	System.out.println(yesButton.getText());
	Actions act=new Actions(driver);
	act.doubleClick(yesButton).perform();
	TakesScreenshot ts= (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/"+time+".png");
	FileHandler.copy(temp, dest);
	
}


}
