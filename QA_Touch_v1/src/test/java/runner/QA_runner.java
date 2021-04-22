package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//--------------------------------------------------------------------------

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/features\\", //the path of the feature files
			glue={"stepDefinition"}, //the path of the step definition files
			monochrome=true,
			plugin= {"pretty",
			        "html:target/cucumber-reports",
					"json:target/cucumber-reports/cucumber.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)
public class QA_runner {
	
}
