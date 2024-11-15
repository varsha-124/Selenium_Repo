package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("https://www.myntra.com/");
	//driver.manage().window().fullscreen();
	Point position = driver.manage().window().getPosition();
	System.out.println(position);
	driver.quit();
	
}
}
