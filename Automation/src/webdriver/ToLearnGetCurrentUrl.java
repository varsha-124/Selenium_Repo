package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.get("https://www.instagram.com/");
	System.out.println(driver.getCurrentUrl());
}
}
