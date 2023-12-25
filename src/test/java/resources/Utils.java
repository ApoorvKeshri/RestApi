package resources;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public RequestSpecification requestSpecification(){
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("").addQueryParam("key","qaclick123")
				.setContentType(ContentType.JSON).build();
		return req;
		
	}
}
