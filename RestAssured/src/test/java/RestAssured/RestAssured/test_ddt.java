package RestAssured.RestAssured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

import DataProvider.XlData;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class test_ddt extends XlData {
	

	public String token = "brWa-UvKCJBMckR1-CKUMzUdp_ilI7g-odAk";
	public RequestSpecification request;
	public Response response;
	
	@Test(dataProvider="testdata")
	public void Createnewuser_DDT(String firstname, String lastname, String email, String gender, String status) {
		
	Map<String, String> pathParams = new HashMap<String, String>();
	pathParams.put("first_name", firstname);
	pathParams.put("last_name", lastname);
	pathParams.put("email", email);
	pathParams.put("gender", gender);
	pathParams.put("status", status);

	response =	given().auth().oauth2(token).contentType("application/json")
.					body(pathParams)
				.when()
					.post("https://gorest.co.in/public-api/users")

				.then()
					.log().body()
					.extract().response();
			String str = response.asString();
			//System.out.println(str);
	
		JSONObject jo = new JSONObject(str);
		String userid = (String) jo.getJSONObject("result").get("id");
	
		System.out.println("created user id is: "+userid);

	}
	
}
