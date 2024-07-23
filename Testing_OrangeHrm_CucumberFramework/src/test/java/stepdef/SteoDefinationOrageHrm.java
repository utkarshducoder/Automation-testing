package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobj.AddEmployeeObj;
import pageobj.ApplyLeave;
import pageobj.LoginObj;
import pageobj.Search;

public class SteoDefinationOrageHrm extends Base{
	
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("user open the browser")
	public void user_open_the_browser() {
		
		loginobject = new LoginObj(driver);
		addempobject = new AddEmployeeObj(driver);
		searchobj = new Search(driver);
		leaveobj = new ApplyLeave(driver);
	}

	@Given("search for {string}")
	public void search_for(String url) {
		driver.get(url);
	}
	@Given("enter the username as {string} and password as {string}")
	public void enter_the_username_as_and_password_as(String uname, String pass) throws InterruptedException {
		loginobject.enterUserName(uname);
		loginobject.enterPassword(pass);
	}

	@Given("click on Login button")
	public void click_on_login_button() {
		loginobject.clickLoginBtn();
	}
	

	//AddEmployee//
	@Then("clicks on PIM")
	public void clicks_on_pim() throws InterruptedException {
		addempobject.clickPIM();
	}
	@Then("click on AddEmployee button")
	public void click_on_add_employee_button() throws InterruptedException {
		addempobject.clickAddButton();
	}

	@Then("fill the details")
	public void fill_the_details() throws InterruptedException {
		addempobject.enterFName("Utkarsh");
		addempobject.enterLName("Gupta");
		
	}

	@Then("click on Save button")
	public void click_on_save_button() throws InterruptedException {
		addempobject.clickOnSubmitButton();
	}
	
	//SearchEmployee//
	@Given("type employee name as {string}")
	public void type_employee_name_as(String empname) throws InterruptedException {
		searchobj.writeEmployeeName(empname);
	}

	@Then("clicks on Search button")
	public void clicks_on_search_button() {
		searchobj.clickSearchBtn();
	}
	
	@Then("check whether employee is found or not")
	public void check_whether_employee_is_found_or_not() {
		searchobj.readTableContents();
	}
	
	
	//ApplyLeave//
	
	@Then("click on leave")
	public void click_on_leave() throws InterruptedException {
		leaveobj.clickOnLeaveLink();
	}

	@Then("select Apply")
	public void select_apply() throws InterruptedException {
		leaveobj.clickOnApplyLink();
	}

	@Then("select leave type")
	public void select_leave_type() throws InterruptedException {
		leaveobj.clickOnSelectLeaveType();
		Thread.sleep(1000);
		leaveobj.clickOnSelectTypeOfLeave();
	}

	@Then("select from date and to date")
	public void select_from_date_and_to_date() throws InterruptedException {
		leaveobj.selectFromDate();
		leaveobj.selectToDate();
	}

	@Then("add comments as {string}")
	public void add_comments_as(String feedback) {
		leaveobj.writeFeedback(feedback);
	}

	@Then("click on Apply button")
	public void click_on_apply_button() {
		leaveobj.clickOnApply();
	}

	@After
	public void tearDown() {
		driver.close();
	}





}
