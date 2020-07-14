package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features"},
				 glue = {"stepdefinations"},
				 plugin = {"json:target/cucumber.json"},
				 monochrome=true, dryRun = false,
				 tags="@regression")


public class runner extends AbstractTestNGCucumberTests {
	
}
