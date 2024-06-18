package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	WebDriver driver;
	public LoginClass(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#user-name")
	WebElement username;
	
	@FindBy(css="#password")
	WebElement password;
	
	@FindBy(css="#login-button")
	WebElement loginBtn;
	
	public void loginDetails(String name,String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		loginBtn.click();
		
	}
		
		
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("#login-button")).click();
	}

