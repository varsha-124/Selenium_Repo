package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment34 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.xpath("//p[contains(text(),'  I have work experience')]")).click();
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Desktop\\Miss.VARSHAV_RESUME.pdf");
	//h2[text()="I'm Experienced"].
}
}
