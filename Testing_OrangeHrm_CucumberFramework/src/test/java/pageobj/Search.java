package pageobj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Search {
	public WebDriver driver;
	public Search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "(//div[contains(@class,'oxd-autocomplete-text-input')]/input[@placeholder='Type for hints...'])[1]")
	WebElement empName;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement click_submitBtn;
	
	@FindBy(xpath = "//div[@class='oxd-table orangehrm-employee-list']")
	WebElement tableContainer;
	
	public void writeEmployeeName(String ename) throws InterruptedException {
		Thread.sleep(2000);
		empName.sendKeys(ename);
	}
	
	public void clickSearchBtn() {
		click_submitBtn.click();
	}
	
	public void readTableContents() {
	    List<WebElement> rows = driver.findElements(By.xpath(".//div[@class='oxd-table-card']"));
	    for (WebElement row : rows) {
	        List<WebElement> cells = row.findElements(By.xpath(".//div[@role='cell']"));
	        boolean found = false;
	        for (WebElement cell : cells) {
	            if (cell.getText().contains("utkarsh")) {
	                found = true;
	                break;
	            }
	        }
	        Assert.assertTrue("The cell does not contain 'utkarsh'", found);
	    }
	}

	
}
