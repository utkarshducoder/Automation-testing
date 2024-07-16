package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	public WebDriver driver;
	public Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@data-qa='signup-name']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//button[@data-qa='signup-button']")
	WebElement signupBtn;
	
	
	@FindBy(id = "password")
	WebElement enterPassword;
	
	@FindBy(id = "days")
	WebElement selectDays;
	
	@FindBy(xpath = "//option[@value='24']")
	WebElement selectDate;
	
	@FindBy(id = "months")
	WebElement selectMonths;
	
	@FindBy(xpath = "//option[contains(text(),'May')]")
	WebElement selectMonth;
	
	@FindBy(id = "years")
	WebElement selectYears;
	
	@FindBy(xpath = "//option[@value='2001']")
	WebElement selectYear;
	
	@FindBy(id = "first_name")
	WebElement fname;

	@FindBy(id = "last_name")
	WebElement lname;
	
	@FindBy(id = "address1")
	WebElement selectAddress;

	@FindBy(id = "state")
	WebElement selectState;
	
	@FindBy(id = "city")
	WebElement selectCity;
	
	@FindBy(id = "zipcode")
	WebElement selectZipCode;
	
	@FindBy(id = "mobile_number")
	WebElement selectMobileNumber;

	@FindBy(xpath = "//button[@data-qa='create-account']")
	WebElement createAccBtn;
	
	@FindBy(xpath = "//h2[@data-qa='account-created']")
	WebElement finalSucsessMessage;
	
	public void enterUserName(String uname) {
		userName.sendKeys(uname);
	}
	public void enterEmailAddress(String email) {
		emailAddress.sendKeys(email);
	}
	public void clickOnSignUpBtn() {
		signupBtn.click();
	}
	
	public void enterPassword(String pwd) {
		enterPassword.sendKeys(pwd);
	}
	public void clickDays() {
		selectDays.click();
	}
	public void selectDate() {
		selectDate.click();
	}
	public void clickMonths() {
		selectMonths.click();
	}
	public void selectMonth() {
		selectMonth.click();
	}
	public void selectYears() {
		selectYears.click();
	}
	public void selectYear() {
		selectYear.click();
	}
	public void enterFirstName(String firstname) {
		fname.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		lname.sendKeys(lastname);
	}
	public void selectAddress(String address) {
		selectAddress.sendKeys(address);
	}
	public void selectState(String state) {
		selectState.sendKeys(state);
	}
	public void selectCity(String city) {
		selectCity.sendKeys(city);
	}
	public void selectZipCode(String zcode) {
		selectZipCode.sendKeys(zcode);
	}
	public void selectMobileNumber(String mobile) {
		selectMobileNumber.sendKeys(mobile);
	}
	public void clickCreateAccountBtn() {
		createAccBtn.click();
	}
	public String getSucsessMessage() {
		return finalSucsessMessage.getText();
	}
	
	
}
