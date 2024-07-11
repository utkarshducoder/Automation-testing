package PageObject;

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
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(xpath  = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement submitBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Products')]")
	WebElement homePg;
	
	public void enterUserName(String uname) {
		username.click();
		username.sendKeys(uname);
	}
	public void enterPassword(String pass) {
		password.click();
		password.sendKeys(pass);
	}
	public void clickSubmit() {
		submitBtn.click();
	}
	public String homePage() {
		String text = homePg.getText();
		return text;
	}
}
