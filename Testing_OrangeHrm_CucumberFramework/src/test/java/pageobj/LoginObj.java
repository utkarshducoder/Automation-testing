package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObj {
	public WebDriver driver;
	public LoginObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement userPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	
	public void enterUserName(String name) throws InterruptedException {
		Thread.sleep(1000);
		userName.sendKeys(name);
	}
	public void enterPassword(String pass) throws InterruptedException {
		Thread.sleep(1000);
		userPassword.sendKeys(pass);
	}
	public void clickLoginBtn() {
		loginButton.click();
	}
	
	
}
