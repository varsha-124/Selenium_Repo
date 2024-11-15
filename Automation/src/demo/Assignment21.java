package demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21 {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='Bus Partner']/..//div[@class='collapsible-indicator col auto']")).click();
	driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/..//input[@type='checkbox']")).click();
	List<WebElement> buses = driver.findElements(By.xpath("//h5[text()='BSR TOURS & TRAVELS']"));
	System.out.println("Total number of buses are "+buses.size());
	 List<WebElement> value = driver.findElements(By.xpath("//strong[@class='h5 fare']"));
	 TreeSet<String> t=new TreeSet<String>();
	 
	for(WebElement v:value)
	{    String var = v.getText();
		//String n = var.toString().replace(",","");
		t.add(var);
	}
	System.out.println(t);
	System.out.println(t.first());
	}
}
