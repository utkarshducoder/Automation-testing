package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerByEmail {
	WebDriver driver;
	public SearchCustomerByEmail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "SearchEmail")
	WebElement searchEmail;
	
	@FindBy(id = "search-customers")
	WebElement searchCustomerBtn;
	
	@FindBy(xpath = "//table[contains(@class,'table-bordered')]")
	WebElement searchResult;
	
	@FindBy(xpath = "//table[contains(@class,'table-bordered')]//thead/tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath = "//table[contains(@class,'table-bordered')]//thead/tr[1]/th")
	List<WebElement> tableColumns;
	
	public void clickOnSearchEmail(String mailid) {
		searchEmail.sendKeys(mailid);
	}
	
	public void clickOnSearchCustomer() {
		searchCustomerBtn.click();
	}
	////table[contains(@class,'table-bordered')]//thead/tr[1]/th
	public boolean searchCustomerByEmail(String email) {
		boolean found = false;
		
		//Count total number of rows
		int ttlRows = tableRows.size();
	
		//Count total number of columns
//		int ttlColumns = tableColumns.size();

		for(int i=1;i<ttlRows;i++) {
			WebElement webElementEmail = driver.findElement(By.xpath("//table[contains(@class,'table-bordered')]//thead/tr[" + i + "]/th[2]"));
			String actualEmailAdd = webElementEmail.getText();
			System.out.println(actualEmailAdd);
			if(actualEmailAdd.equals(email)) {
				found = true;
			}
		}
		return found;
	}
	
}
