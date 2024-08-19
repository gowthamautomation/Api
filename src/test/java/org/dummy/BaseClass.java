package org.dummy;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification requestSpecification;
	Response response;

	public void getHeader(String headername, String headervalue) {
		requestSpecification = RestAssured.given().header(headername, headervalue);
	}

	public Response Type(String req, String endpoint) {
		switch (req) {
		case "GET":
			response = requestSpecification.when().get(endpoint);
			break;

		case "POST":
			response = requestSpecification.when().post(endpoint);
			break;

		case "PUT":
			response = requestSpecification.when().put(endpoint);
			break;

		case "DELETE":
			response = requestSpecification.when().delete(endpoint);
			break;

		default:
			break;
		}

		return response;
	}

	public int statusCode(Response response) {
		int status = response.getStatusCode();
		return status;
		
	}

	

	public String pretty(Response responseh2) {
		String asPrettyString = response.getBody().asPrettyString();
		return asPrettyString;
	}

}
