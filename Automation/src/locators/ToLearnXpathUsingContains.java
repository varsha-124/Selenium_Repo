package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathUsingContains {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("varshaganiga01@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Contact uploading')]")).click();
}
}
