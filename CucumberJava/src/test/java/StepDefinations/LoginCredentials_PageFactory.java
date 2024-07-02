//package StepDefinations;
//
//import java.time.Duration;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import io.cucumber.java.en.*;
//import pagefactory.HomePage_PF;
//import pagefactory.LoginPage_PF;
//
//public class LoginCredentials_PageFactory {
//    WebDriver driver = null;
//    WebDriverWait wait;
//    LoginPage_PF loginpf;
//    HomePage_PF homepf;
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
//        loginpf = new LoginPage_PF(driver);
//        loginpf.enterUserName(username);
//        loginpf.enterPassword(password);
//    }
//
//    @And("clicks on submit button")
//    public void clicks_on_submit_button() {
//        loginpf.clickLogin();
//    }
//
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() throws InterruptedException {
//        homepf = new HomePage_PF(driver);
//        homepf.clickLogOut();
//    }
//}
