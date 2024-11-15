package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTageName {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> link = driver.findElements(By.tagName("a"));
	//System.out.println(link.size());
	//link.get(link.size()-1).click();
	for( WebElement i:link) {
	System.out.println(i.getText());
	}
}
}
