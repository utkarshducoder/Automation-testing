package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing {
	WebDriver driver;
	public Landing(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//Initializing the driver information and making it global throughout the program
	}
	@FindBy(id="userEmail") 
	WebElement userEmail;
	//@FindBy is a replacemnt of driver.findElement(By.id())
	@FindBy(id = "userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement submit;
	
	//Describing Actions of page
	public ProductCatalogue landingDetails(String email, String password) {
		userEmail.sendKeys(email); //WebElement.parameter
		userPassword.sendKeys(password); //WebElement.parameter
		submit.click();
		ProductCatalogue pd = new ProductCatalogue(driver);
		return pd;
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
}
