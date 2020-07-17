package stepDefinations;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import fileReaders.configReader;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class Backgroundsteps extends configReader{
	
	public Backgroundsteps() throws IOException {
		//super();
	}

	@BeforeTest
	@Given("^user have authorized token$")
	public void user_have_authorized_token() {
		RestAssured.baseURI =getBaseUrl();
		RestAssured.basePath = getBasepath();
		RestAssured.authentication = RestAssured.oauth2(getTokenId());	
	}
		
		
	

}
