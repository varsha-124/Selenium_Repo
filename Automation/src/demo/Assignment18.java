package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment18 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]"));
	String title = search.getAttribute("title");
	System.out.println(title);
	if(title.contains("Search for Products"))
	{
System.out.println("Tool tip displayed");
	}
else
System.out.println("Tool tip not displayed");

}
}
