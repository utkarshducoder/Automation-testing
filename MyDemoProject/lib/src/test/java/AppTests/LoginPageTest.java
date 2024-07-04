//Inside Test we create a class where we create test cases and here we create test methods and in that we call the methods of Page Steps class
//So from Test we class we call steps class methods and from steps class we call methods of UI pages class
package AppTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.LoginPageSteps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

	@Steps
	LoginPageSteps loginpagesteps;
	
	@Managed(driver = "chrome")
	WebDriver browser;
	
	@Test
	public void userIsOnLoginPage() {
		loginpagesteps.openPage(); //make sure that user is on login page
		loginpagesteps.loginUser(); //will login the user
		loginpagesteps.validateLoginUser(); //to check whether the user is sucsessfully logged in or not
	}
	
	
	
}
