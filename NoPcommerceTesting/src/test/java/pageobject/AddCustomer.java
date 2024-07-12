package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	WebDriver driver;
	public AddCustomer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[contains(@class,'nav-sidebar')]/li[4]")
	WebElement link_customer;

	@FindBy(xpath = "//a[@href = '/Admin/Customer/List']/p[contains(text(),'Customers')]")
	WebElement link_customer_menuitem;
	
	@FindBy(xpath = "//a[@href = '/Admin/Customer/Create']")
	WebElement addNewBtn;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id = "FirstName")
	WebElement fname;
	
	@FindBy(id = "LastName")
	WebElement lname;
	
	@FindBy(id = "Gender_Male")
	WebElement malegender;
	
	@FindBy(id = "Gender_Female")
	WebElement femalegender;
	
	@FindBy(id = "DateOfBirth")
	WebElement dob;
	
	@FindBy(id = "Company")
	WebElement company;
	
	@FindBy(id = "AdminComment")
	WebElement txtadmin;
	
	@FindBy(xpath = "//button[@name='save']")
	WebElement saveBtn;
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void clickOnCustomerMenu() {
		link_customer.click();
	}
	
	public void selectCustomerItem() {
		link_customer_menuitem.click();
	}
	public void clickAddNew() {
		addNewBtn.click();
	}
	public void enterEmail(String mailId) {
		email.sendKeys(mailId);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void enterFname(String firstname) {
		fname.sendKeys(firstname);
	}
	public void enterLname(String lastname) {
		lname.sendKeys(lastname);
	}
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			malegender.click();
		}
		else {
			femalegender.click();
		}
	}
	public void selectDate(String date) {
		dob.sendKeys(date);
	}
	public void selectCompany(String comp) {
		company.sendKeys(comp);
	}
	public void enterTextArea(String adminTxt) {
		txtadmin.sendKeys(adminTxt);
	}
	
	public void clickOnSaveButton() {
		saveBtn.click();
	}
	
	
	
	
	
}
