//Inside PageSteps we create a class where we create methods and call the methods of UIPages class
package Steps;

import UIPages.LoginPage;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

public class LoginPageSteps {
	private LoginPage loginpage;
	
	@Step
	public void openPage() {
		loginpage.open();
	}

	@Step
	public void loginUser() {
		loginpage.doLogin();
	}
	
	@Step
	public void validateLoginUser() {
		String actualText = loginpage.accountPageIsValid();
		String expectedText = "Dashboard";
		Assert.assertEquals(expectedText, actualText);
	}
	

}
