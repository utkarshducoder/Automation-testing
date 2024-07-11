package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C://Users//UtkarshGupta//eclipse-workspace//Test_DemoQA//src//test//resources//Features//loginDemo.feature",
		glue = "StepDefination",
		dryRun = false,
		monochrome = true,	
		plugin = {"pretty",
				"html:target/report/cucumber-reports"}
		)
public class Run {

}
