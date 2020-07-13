package stepdefinations;

import java.io.IOException;

import org.testng.annotations.Test;

import DataProvider.BaseClass;

import cucumber.api.java.en.Given;

public class backgroundsteps extends BaseClass{
	
	
	@Given("^I am an authorised person$")
	public void user_startsexection() throws IOException {
		initialize();
	}
		
		
	

}
