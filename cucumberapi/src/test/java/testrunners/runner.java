package testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"classpath:features"},
				 glue = {"stepdefinations"},
				 plugin = {"json:target/cucumber.json"},
				 monochrome=true, dryRun = false,
				 tags="@regression")


public class runner extends AbstractTestNGCucumberTests {
	
}
