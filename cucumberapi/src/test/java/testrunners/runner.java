package testRunners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"classpath:features"},
				 glue = {"stepDefinations"},
				 plugin = {"json:ResultJsons/cucumber.json"},
				 monochrome=true, dryRun = false,
				 tags="@regression")

@Test
public class runner extends AbstractTestNGCucumberTests {
	
}
