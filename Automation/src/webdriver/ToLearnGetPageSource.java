package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();//launch empty browser
	driver.get("https://www.flipkart.com/");
	String sourcecode = driver.getPageSource();
	System.out.println(sourcecode);
}
}
