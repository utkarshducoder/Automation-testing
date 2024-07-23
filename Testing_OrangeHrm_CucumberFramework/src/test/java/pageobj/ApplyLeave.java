package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyLeave {
	public WebDriver driver;
	public ApplyLeave(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//a[@href = '/web/index.php/leave/viewLeaveModule']")
	WebElement leave_link;
	
	@FindBy(xpath = "//ul/li[@class='oxd-topbar-body-nav-tab']/a[contains(text(),'Apply')]")
	WebElement apply_link;
	
	@FindBy(xpath = "//div[contains(@class,'oxd-select-text')]")
	WebElement click_leaveType;
	
	@FindBy(xpath = "//div[@role='listbox']/div/span[contains(text(),'CAN - FMLA')]")
	WebElement select_leaveType;
	
	@FindBy(xpath = "(//div[@class='oxd-date-input'])[1]")
	WebElement select_fromDate;
	
	@FindBy(xpath = "//i[contains(@class,'bi-chevron-right')]")
	WebElement click_rightArrow;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-dates-grid']/div/div[contains(text(),'19')]")
	WebElement select_Fdate;
	
	@FindBy(xpath = "(//div[@class='oxd-date-input'])[2]")
	WebElement select_toDate;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-dates-grid']/div/div[contains(text(),'23')]")
	WebElement select_Tdate;
	
	@FindBy(tagName = "textarea")
	WebElement add_comment;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement apply_btn;
	
	public void clickOnLeaveLink() throws InterruptedException {
		Thread.sleep(2000);
		leave_link.click();
	}
	public void clickOnApplyLink() throws InterruptedException {
		Thread.sleep(2000);
		apply_link.click();
	}
	public void clickOnSelectLeaveType() throws InterruptedException {
		Thread.sleep(2000);
		click_leaveType.click(); 
	}
	public void clickOnSelectTypeOfLeave() throws InterruptedException {
		Thread.sleep(2000);
		select_leaveType.click(); 
	}
	public void selectFromDate() throws InterruptedException {
		select_fromDate.click(); 
		Thread.sleep(1000);
		click_rightArrow.click();
		select_Fdate.click();
	}
	public void selectToDate() throws InterruptedException {
		select_toDate.click();
		Thread.sleep(1000);
		select_Tdate.click();	
	}
	public void writeFeedback(String mssge) {
		add_comment.sendKeys(mssge); 
	}
	public void clickOnApply() {
		apply_btn.click(); 
	}
	
	
	
	
	
	
	
		
}