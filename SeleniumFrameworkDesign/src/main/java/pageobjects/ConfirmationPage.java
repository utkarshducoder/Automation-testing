package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "hero-primary")
	WebElement text;
	
	public String getConfirmationMessage() {
		return text.getText();
	}
	
	
//	String text = driver.findElement(By.className("hero-primary")).getText();

}
