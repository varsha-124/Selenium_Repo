package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGet {

	public static void main(String[] args) {
		
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.instagram.com/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
