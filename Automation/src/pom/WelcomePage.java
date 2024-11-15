package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//declaration for register
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	//declaration for login
	@FindBy(linkText= "Log In")
	private WebElement loginLink;
	
	
	//initialization
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//provide getters
	public WebElement getRegisterLink() {
		return registerLink;	
	}
	
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	
	
}
