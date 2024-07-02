//package StepDefinations;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.en.*;
//import pages.LoginPage;
//
//import org.junit.Assert; // Updated import
//
//public class LoginCredentials_POM {
//    WebDriver driver = null;
//    WebDriverWait wait;
//
//    LoginPage login;
//    
//    @Given("browser is open")
//    public void browser_is_open() {
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//    }
//
//    @And("user is on login page")
//    public void user_is_on_login_page() {
//        driver.get("https://practicetestautomation.com/practice-test-login/");
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) {
//        login = new LoginPage(driver);
//        login.enterUsername(username);
//        login.enterPassword(password);
//    }
//
//    @And("clicks on submit button")
//    public void clicks_on_submit_button() {
//        login.clickSubmit();
//    }
//
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() throws InterruptedException {
//        login.logout();
//    }
//}
