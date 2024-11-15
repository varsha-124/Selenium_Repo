package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register = driver.findElement(By.linkText("Register"));
	System.out.println(register.getCssValue("color"));
	String padding = register.getCssValue("padding-left");
	System.out.println(padding);
	String fontSize = register.getCssValue("font-size");
	System.out.println(fontSize);
	
}
}
