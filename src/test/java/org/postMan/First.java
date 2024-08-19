package org.postMan;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;

public class First {
	public static void main(String[] args) {
		RequestSpecification requestSpecification;
		Response response;

		requestSpecification = RestAssured.given();

		requestSpecification.body("{\r\n"
				+ "  \"data\": {\r\n"
				+ "    \"id\": 24342,\r\n"
				+ "    \"flightName\": \"AirIndia\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"87\",\r\n"
				+ "    \"URL\": \"https://en.wikipedia.org/wiki/Air_India\",\r\n"
				+ "    \"Created_Date\": \"2024-04-07 17:27:18\",\r\n"
				+ "    \"Updated_Date\": \"2024-04-07 17:27:18\"\r\n"
				+ "  },\r\n"
				+ "  \"support\": {\r\n"
				+ "    \"url\": \"https://omrbranch.com\",\r\n"
				+ "    \"text\": \"For Joining Automation Course, Please Contact-Velmurugan 9944152058\"\r\n"
				+ "  }\r\n"
				+ "}");
				
		Response post = requestSpecification.post("https://omrbranch.com/api/flight/24342");
		System.out.println(post);
		
		
		
		
	}

}
