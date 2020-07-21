package stepDefinations;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import fileReaders.ConfigReader;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import utilities.logger;

public class Backgroundsteps extends ConfigReader{
	
		
	public Backgroundsteps() throws IOException {
		//super();
	}

	@BeforeTest
	@Given("^user gets authorized token$")
	public void user_gets_authorized_token() {
		logger.log().info("reading baseURI & access token");
		RestAssured.baseURI =getBaseUrl();
		RestAssured.basePath = getBasepath();
		RestAssured.authentication = RestAssured.oauth2(getTokenId());	
	}
		
		
	

}
