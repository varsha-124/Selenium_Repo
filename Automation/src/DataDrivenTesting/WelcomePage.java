package DataDrivenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
@FindBy(linkText="Register")
private WebElement registerLink;
public WelcomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

@FindBy(id="register-button")
private WebElement registerButton;


public WebElement getRegisterLink() {
	return registerLink;
}


public WebElement getRegisterButton() {
	return registerButton;
}




}

