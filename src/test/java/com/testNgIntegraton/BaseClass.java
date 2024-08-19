
package com.testNgIntegraton;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification requestSpecification;
	Response response;

	public void setHeader(String headerName, String headerValue) {
		requestSpecification = RestAssured.given().header(headerName, headerValue);

	}

	public Response addReqType(String reqType, String endPoint) {
		switch (reqType) {
		case "GET":
			response = requestSpecification.when().get(endPoint);
			break;
		case "POST":
			response = requestSpecification.when().post(endPoint);
			break;
		case "PUT":
			response = requestSpecification.when().put(endPoint);
			break;
		case "DELETE":
			response = requestSpecification.when().delete(endPoint);
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

	public String pretty(Response response) {
		String prettyString = response.getBody().asPrettyString();
		return prettyString;
		
	}

}
