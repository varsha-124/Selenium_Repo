package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();//5
	driver.get("https://www.flipkart.com/");//1
	String title = driver.getTitle();//2
	String url = driver.getCurrentUrl();//3
	String sc = driver.getPageSource();//4
	driver.navigate().refresh();//6
	String id = driver.getWindowHandle();//7
	driver.close();
	
	
	
}
}
