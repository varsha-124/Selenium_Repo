package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WelcomePage wp=new WelcomePage(driver);//page class object creation
	wp.getRegisterLink().click();//calling getter() method of register element
	wp.getLoginLink().click();
	LoginPage lp=new LoginPage(driver);
	lp.getEmailTextField().sendKeys("varshaganiga01@gmail.com");
	
	

}
}
