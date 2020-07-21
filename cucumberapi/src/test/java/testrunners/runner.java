package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"classpath:features"},
				 glue = {"stepDefinations"},
				 plugin = {"pretty","html:target/CucumberResults",
						   "json:ResultJsons/cucumber.json"},
				 monochrome=true, dryRun = false,
				 tags="@regression")


public class runner extends AbstractTestNGCucumberTests{
		
	  
	
}
