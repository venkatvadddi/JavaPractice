package RestAssured.RestAssured;

import static io.restassured.RestAssured.given;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import DataProvider.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class testone {
	

	public String token = "brWa-UvKCJBMckR1-CKUMzUdp_ilI7g-odAk";
	public RequestSpecification request;
	public Response response;
	String file = System.getProperty("user.dir")+"\\testdata\\output.txt";
	String userid;
	
	@Test(priority=1)
	public void Get_Response() throws IOException
	{			
			response =given()
			          		.headers("Authorization","Bearer "+token,"Content-Type",ContentType.JSON,
			              				"Accept",ContentType.JSON)
			           		.get("https://gorest.co.in/public-api/users");
		
					
		String actual = response.getBody().asString();
		System.out.println("Actual is: "+actual);
		
	
   
		/*FileWriter file = new FileWriter(file);
		file.write(actual);
		file.flush();*/			
		
		File file1 = new File(file); 
		BufferedReader br = new BufferedReader(new FileReader(file1)); 
		String expected = br.readLine(); 
		System.out.println("expected is: "+expected);
		Assert.assertEquals(actual, expected);
	
	}
	
	@Test(priority=2)
	public void Post_newuser_Pojo() throws IOException
	{
		String first_name = "firstname" + CommonFunctions.getrandomAlphabets(4);
		String last_name = "lastname" + CommonFunctions.getrandomAlphabets(4);
		String email = "email" + CommonFunctions.getrandomAlphabets(4) + "@gmail.com";

		User postuserdata = new User(first_name, last_name, "male", email, "active");

		System.out.println("firsname is: " + postuserdata.getFirst_name());
		
		response =	given().auth().oauth2(token)
							.contentType("application/json")
.								body(postuserdata)
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
			
			String filepath = System.getProperty("user.dir")+"\\testdata\\output.txt";
			FileWriter file = new FileWriter(filepath);
			file.write(str);
			file.flush();		
	} 

	
	@Test(priority=3)
	public void post_newuser_hashmap() {
	String firstname = "firstname" + CommonFunctions.getrandomAlphabets(3);
	String lastname = "lastname" + CommonFunctions.getrandomAlphabets(3);
	String email = "email" + CommonFunctions.getrandomAlphabets(3) + "@gmail.com";
	
	Map<String, String> pathParams = new HashMap<String, String>();
	pathParams.put("first_name", firstname);
	pathParams.put("last_name", lastname);
	pathParams.put("email", email);
	pathParams.put("gender", "male");
	pathParams.put("status", "active");

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
		userid = (String) jo.getJSONObject("result").get("id");
	
		System.out.println("created user id: "+userid);

	}  

	@Test(priority=4)
	public void delete_record() throws InterruptedException
	{	
        
		Response res =	given().headers("Authorization","Bearer "+token,"Content-Type",ContentType.JSON,
  									"Accept",ContentType.JSON)
					
						.delete("https://gorest.co.in/public-api/users/"+userid)
		
						.then()
							.statusCode(200)
							.log().body()
							.extract().response();
		
		Thread.sleep(3000);		
		String str = res.asString();
		System.out.println("After Delete: "+str);
	}

}



