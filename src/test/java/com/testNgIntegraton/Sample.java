package com.testNgIntegraton;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class Sample extends BaseClass {
	@Test
	public void getSingleUser() {
		setHeader("content-type", "application/json");
		Response requestType = addReqType("GET", "https://www.omrbranch.com/api/flights?page=1");
		int i = statusCode(requestType);
		System.out.println(i);
//Assert.assertEquals(i, 200,"verify http status code");	

		String pretty = pretty(requestType);
		System.out.println(pretty);

	}

}
