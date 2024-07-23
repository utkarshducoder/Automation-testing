package stepdef;

import org.openqa.selenium.WebDriver;

import pageobj.AddEmployeeObj;
import pageobj.ApplyLeave;
import pageobj.LoginObj;
import pageobj.Search;

public class Base {
	public WebDriver driver;
	public LoginObj loginobject;
	public AddEmployeeObj addempobject;
	public Search searchobj;
	public ApplyLeave leaveobj;
}
