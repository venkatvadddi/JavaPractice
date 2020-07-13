package DataProvider;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigReader.ReadProperties;
import io.restassured.RestAssured;

public class BaseClass extends ReadProperties{	
	
	/*ReadProperties filereader;
	
	public BaseClass(ReadProperties reader) throws IOException {
		this.filereader=reader;
	}*/

	public void initialize() throws IOException {
		
			RestAssured.baseURI = getBaseUrl();
			RestAssured.basePath = getBasepath();
			RestAssured.authentication = RestAssured.oauth2(getTokenId());	
			
		}


}
