package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Bus Ticket Booking Online made Easy, Secure with Top Bus Operators - redBus"))
	{
		System.out.println("Welcome page displayed.");
	}
	else
		System.out.println("Welcome page not displayed");
	driver.manage().window().maximize();
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	driver.close();
}
}
