package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com");
	//Thread.sleep(2000);
	driver.navigate().back();
	//Thread.sleep(2000);
	driver.navigate().forward();
	driver.manage().window().setPosition( new Point(200,250));
	//driver.close();
}
}
