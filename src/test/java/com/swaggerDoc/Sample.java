package com.swaggerDoc;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Sample extends BaseClass {

@Test
public void login() {
//.Header
	setHeader("accept", "application/json");
	addBasicAuth("greenstechchennaiomr@gmail.com", "Learn@123");
	Response reqType = addReqType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
	int statusCode = statusCode(reqType);
	System.out.println(statusCode);
	String pretty = pretty(reqType);
	System.out.println(pretty);
	
	
	



}
	
	
	
	
	
	
	
	
	
	
}
