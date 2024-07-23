package pageobj;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeeObj {
	public WebDriver driver;
	public AddEmployeeObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	WebElement pimLink;

	@FindBy(xpath = "//ul/li/a[contains(text(),'Add Employee')]")
	WebElement addBtn;

	@FindBy(xpath = "//input[@placeholder = 'First Name']")
	WebElement enterFirstName;

	@FindBy(xpath = "//input[@placeholder = 'Last Name']")
	WebElement enterLastName;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickSubmitButton;


	public void clickPIM() throws InterruptedException {
		Thread.sleep(4000);
		pimLink.click();
	}
	public void clickAddButton() throws InterruptedException {
		Thread.sleep(2000);
		addBtn.click();
	}
	public void enterFName(String fname) throws InterruptedException {
		Thread.sleep(2000);
		enterFirstName.sendKeys(fname);
	}
	public void enterLName(String lname) throws InterruptedException {
		Thread.sleep(2000);
		enterLastName.sendKeys(lname);
	}
	public void clickOnSubmitButton() throws InterruptedException {
		Thread.sleep(2000);
		clickSubmitButton.click();
	}
}
