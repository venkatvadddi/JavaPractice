package apiHelpers;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import stepDefinations.Backgroundsteps;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.Map;


public class RestClient {
	
			ResponseSpecification responseSpecification;
			
			public RestClient() throws IOException {
				//super();				
			}
		
				
			//Get request
			public Response doGetRequest(String requestPath) {
				
				return 	given()
				   		   .when()
				   		   .get(requestPath);
			}
			
						
			//Get request with query parameters
			public Response doGetRequestWithQueryParam(String res, 
													  Map<String, String> params) {
		
				Response response = given()
										.queryParams(params)
									.when()
									.get(res);
		
				return response;
		
			}
			
			//Get request with headers
			public Response doGetRequestWithHeader(String res,
												  Map<String, String> headers) {
		
				Response response = given()
										.headers(headers)
									.when()
									.get(res);
		
				return response;
		
			}
			
			//Post Request
			public Response doPostRequest(String uri, Object body) {
				
				return given()
						.contentType(ContentType.JSON)
						.spec(PayloadResponseInfo())
						.when()
						.body(body)
						.post(uri);
			}
			
			//Put request
			public Response doPutRequest(String res , Object body) {
		
				Response response = given()
								   .when()
								   .body(body)
								   		.put(res);
		
				return response;		
			}
			
			//Patch request
			public Response doPatchRequest(String res , Object body) {
		
				Response response = given()
								   .when()
								   .body(body)
								   		.patch(res);
		
				return response;		
			}
			
			//Delete request
			public Response doDeleteRequest(String res) {
		
				Response response = given()
								   .when()
								   		.delete(res);
		
				return response;		
			}
			
			//Payloadresponse
			public RequestSpecification PayloadResponseInfo() {
				
				RequestSpecBuilder logBuilder;
				logBuilder = new RequestSpecBuilder();		
				return logBuilder.build();
				
			}

}
