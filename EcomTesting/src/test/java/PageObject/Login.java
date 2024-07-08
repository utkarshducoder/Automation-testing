package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver; 
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[contains(@class,'navbar-nav')]/li/a[contains(text(),' Signup / Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement login;
	
	@FindBy(xpath = "//input[@data-qa='login-password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement logedInBtn;
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	public void enterEmail(String mailId) {
		login.sendKeys(mailId);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLoginButton() {
		logedInBtn.click();
	}
	
}
