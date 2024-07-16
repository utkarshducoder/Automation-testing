package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithValidCredentials {
	public WebDriver driver;
	public LoginWithValidCredentials(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement enterEmail;
	
	
	@FindBy(xpath = "//input[@data-qa='login-password']")
	WebElement enterPassword;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement clickLogin;
	
	@FindBy(xpath = "(//ul[contains(@class,'nav navbar-nav')]/li)[4]")
	WebElement logoutBtn;
	
	public void enterEmailAddress(String mail) {
		enterEmail.sendKeys(mail);
	}
	public void enterPassword(String pwd) {
		enterPassword.sendKeys(pwd);
	}
	public void clickOnLoginButton() {
		clickLogin.click();
	}
	public String getTitleOfHomePage() {
		return driver.getTitle();
	}
	public void clickOnLogoutButton() {
		logoutBtn.click();
	}
	
	
	
	
	
}
