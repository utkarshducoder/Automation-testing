package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackgroundDemo/BackgroundDemo.feature",glue= {"StepsForBackground"},
	monochrome = true,
	plugin = {
	        "pretty", // Prints Gherkin source with additional colors and stack traces for errors
	        "html:target/cucumber-reports/cucumber-html-report.html",
	        "json:target/cucumber-reports/cucumber.json", // Generates a JSON report
	        "junit:target/cucumber-reports/cucumber.xml" // Generates an XML report (useful for CI integration)
}
		)
public class TestRunnerForBackground {

}
