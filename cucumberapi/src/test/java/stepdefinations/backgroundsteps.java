package stepDefinations;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import fileReaders.ConfigReader;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class Backgroundsteps extends ConfigReader{
	
	public Backgroundsteps() throws IOException {
		super();
	}

	@BeforeTest
	@Given("^user have authorized token$")
	public void user_get_authorizedtoken()  {
				
			RestAssured.baseURI = getBaseUrl();
			RestAssured.basePath = getBasepath();
			RestAssured.authentication = RestAssured.oauth2(getTokenId());	
		
	}
		
		
	

}
