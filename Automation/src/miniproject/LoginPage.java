package miniproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy (linkText="Log in")
private WebElement loginLink;


@FindBy(id="Email")
  private WebElement emailTF;

@FindBy(id="Password")
private WebElement passTF;

@FindBy(xpath="//input[@value='Log in']")
private WebElement loginBtn;

@FindBy(linkText="Log out")
private WebElement logoutBtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getLoginLink() {
	return loginLink;
}

public WebElement getEmailTF() {
	return emailTF;
}

public WebElement getPassTF() {
	return passTF;
}

public WebElement getLoginBtn() {
	return loginBtn;
}

public WebElement getLogoutBtn() {
	return logoutBtn;
}




}