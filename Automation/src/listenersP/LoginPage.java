package listenersP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(linkText="LOGIN")
	private WebElement loginLink;
	
	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(id="password")
	private WebElement passTF;
	
	@FindBy(id="last")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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

	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
