package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement radioButton = driver.findElement(By.xpath("//label[text()='Poor']/..//input[@type='radio']"));
	System.out.println("Before Clicking");
	System.out.println(radioButton.isSelected());
	System.out.println("After clicking");
	radioButton.click();
	System.out.println(radioButton.isSelected());
	
}
}
