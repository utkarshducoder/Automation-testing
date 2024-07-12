package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Logout")
	WebElement logoutLink;

	public void enterEmail(String mail) {
		email.clear();
		email.sendKeys(mail);
	}

	public void enterPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}

	public void clickLogin() {
		loginBtn.click();
	}
	
	public void clickLogoutBtn() {
		logoutLink.click();
	}
}
