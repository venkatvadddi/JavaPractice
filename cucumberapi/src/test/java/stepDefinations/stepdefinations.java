package stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import java.io.IOException;

import apiHelpers.RestClient;

public class stepdefinations {
	
	RestClient rest;
	
	@Given("^I am authorized user$")
	public void user_authentication() {
		 given().
		 	contentType(ContentType.JSON).accept(ContentType.JSON);
		
	}
	
	@When("^user performs GET operation$")
	public void user_startsexection2() throws IOException {
		rest = new RestClient();
		String response = rest.doGetRequest("users").asString();
		//String response = when().get("users").asString();
		System.out.println(response);
	}
	
	@Then("^user should get all user information$")
	public void user_startsexection3() {		
			
	}
	
	@Given("user perfoms post operation")
	public void user_perfoms_post_operation() {
	
	}

}
