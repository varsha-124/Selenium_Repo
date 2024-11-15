package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnXpathDependentIndependent {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://demowebshop.tricentis.com/");
	//driver.findElement(By.xpath("//a[text()='Simple Computer']/../..//input[@value='Add to cart']")).click();
	driver.get("https://www.dunzo.com/search");
	driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("apples kashmiri");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Apple - Kashmiri']/../..//p[contains(text(),'₹')]")).click();
}
}
