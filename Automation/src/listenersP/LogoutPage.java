package listenersP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
@FindBy(xpath="//span[text()='SkillRary Admin']")
private WebElement logoutLink;

@FindBy(linkText="Sign out")
private WebElement logoutBtn;

public LogoutPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getLogoutLink() {
	return logoutLink;
}

public WebElement getLogoutBtn() {
	return logoutBtn;
}


}
