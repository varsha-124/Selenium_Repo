package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		if(title.contains("Demo Web Shop"))
			System.out.println("DemoWebShop page displayed");
		else
			System.out.println("Not displayed");
		driver.findElement(By.linkText("Facebook")).click();
		switchWindow(driver,"NopCommerce");
		String ftitle = driver.getTitle();
		if(ftitle.contains("NopCommerce"))
			System.out.println("FaceBook Welcome page displayed");
		else
			System.out.println("Not displayed");
		driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
		switchWindow(driver,"Sign up");
		Thread.sleep(2000);
		String stitle = driver.getTitle();
		if(stitle.contains("Sign up"))
		{
			System.out.println("Signup Page displayed");
		}
		driver.findElement(By.name("firstname")).sendKeys("Varsha");
		
	}
	public static void switchWindow(WebDriver driver, String url)
	{
		Set<String> ids = driver.getWindowHandles();
		for(String id:ids)
		{
		driver.switchTo().window(id);
		String newUrl=driver.getCurrentUrl();
		if(newUrl.contains(url))
		{
			break;
	}
	}
	}
	}
