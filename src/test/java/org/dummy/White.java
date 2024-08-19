package org.dummy;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class White extends BaseClass {
	@Test
	public void Normal() {
		getHeader("content-type", "application/json");
		
		Response reqType = Type("GET","https://www.omrbranch.com/api/flights?page=1");
		
		int statusCode = statusCode(reqType);
		System.out.println(statusCode);
		
		String pretty = pretty(reqType);
		System.out.println(pretty);
		
		JsonPath path = response.jsonPath();
		int i = path.getInt("data id");
		System.out.println(i);
	}

	

}
