package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//driver.manage().window().minimize();
	driver.manage().window().fullscreen();
	driver.manage().window().minimize();
	//driver.manage().window().getSize();	
}
}
