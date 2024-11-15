package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	//Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Contact')]")).click();
	List<WebElement> ele = driver.findElements(By.tagName("h1"));
	List<WebElement> ele1 = driver.findElements(By.tagName("h2"));
	//System.out.println(ele);
	for(WebElement e:ele)
	{
		System.out.println(e.getText());
	}
	for(WebElement e:ele1)
	{
		System.out.println(e.getText());
	}
}
}