package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
@FindBy(linkText="SIGNUP")
private WebElement registerLink;

@FindBy(name="firstname")
private WebElement firstName;

@FindBy(name="lastname")
private WebElement lastName;

@FindBy(xpath="(//input[@placeholder='Email'])[2]")
private WebElement email;

@FindBy(xpath="(//input[@placeholder='Password'])[2]")
private WebElement password;

@FindBy(name="repassword")
private WebElement confirmPassword;

@FindBy(name="signup")
private WebElement registerButton;



public RegisterPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getRegisterLink() {
	return registerLink;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getConfirmPassword() {
	return confirmPassword;
}

public WebElement getRegisterButton() {
	return registerButton;
}



}
