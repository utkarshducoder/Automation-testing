//Inside UIPages we create a class in whihc we write the locators

package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class LoginPage extends PageObject {
	
	public void doLogin() {
		 $("input[name='username']").sendKeys("Admin");
		 $("//input[@name='password']").sendKeys("admin123");
		 $("//button[@type='submit']").click();
	}
	
	public String accountPageIsValid() {
		return $("//div/span/h6").getText();
	}
	
}
