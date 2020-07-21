package stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import utilities.Context;
import static io.restassured.RestAssured.*;

import java.io.IOException;

import apiHelpers.RestClient;

public class stepdefinations {
	
	RestClient rest;
	Response response;
	
	
	@Given("^I am authorized user$")
	public void user_authentication() {		
		 given().
		 	contentType(ContentType.JSON).accept(ContentType.JSON);
		
	}
	
	@When("^I performs GET operation for \"([^\"]*)\"$")
	public void I_perform_Getfor(String val) throws IOException {
		rest = new RestClient();
		response = rest.doGetRequest(val);		
	}
	
	@Then("^I should get all user information$")
	public void I_get_userinfo() {	
			
		response.then().statusCode(200);
		String response = when().get("users").asString();
		System.out.println(response);
		
	}
	
	
}
