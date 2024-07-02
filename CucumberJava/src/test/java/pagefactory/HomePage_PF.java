package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF {
	WebDriver driver;
	public HomePage_PF(WebDriver driver){
		this.driver = driver;
//		PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement logout_btn;
	
	public void clickLogOut() {
		logout_btn.click();
	}
	
}
