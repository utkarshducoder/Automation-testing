package definations;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

import java.util.Map;

public class RegistrationSteps {
    WebDriver driver;
    RegisterPage registerPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
        registerPage = new RegisterPage(driver);
    }

    @Given("The user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        // Ensure that the user is on the registration page
    }

    @When("The user enters valid data in all mandatory fields")
    public void the_user_enters_valid_data_in_all_mandatory_fields(io.cucumber.datatable.DataTable dataTable) {
        Map dataMap = dataTable.asMaps(String.class, String.class).get(0);

        registerPage.setFirstName(dataMap.get("first name"));
        registerPage.setLastName(dataMap.get("last name"));
        registerPage.setEmail(dataMap.get("email"));
        registerPage.setPassword(dataMap.get("password"));
        registerPage.setConfirmPassword(dataMap.get("confirm password"));
    }

    @And("The user selects the {string} gender option")
    public void the_user_selects_the_gender_option(String gender) {
        registerPage.selectGender(gender);
    }

    @And("The user subscribes to the newsletter")
    public void the_user_subscribes_to_the_newsletter() {
        registerPage.subscribeToNewsletter();
    }

    @And("The user clicks the {string} button")
    public void the_user_clicks_the_button(String button) {
        if (button.equals("Register")) {
            registerPage.clickRegisterButton();
        }
    }

    @Then("The user is successfully registered")
    public void the_user_is_successfully_registered() {
        String resultMessage = registerPage.getRegistrationResultMessage();
        assertTrue(resultMessage.contains("Your registration completed"), "Registration failed or message not found.");
    }

    @And("The user is redirected to their account dashboard")
    public void the_user_is_redirected_to_their_account_dashboard() {
        // Implement any additional checks for redirection if necessary
    }

//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
