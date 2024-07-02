package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='username']")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement txt_submit;

	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		txt_submit.click();
	}
	

}
