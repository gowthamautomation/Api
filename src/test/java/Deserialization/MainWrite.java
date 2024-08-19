package Deserialization;

import org.testng.annotations.Test;
import org.testng.Assert;

import io.restassured.response.Response;


public class MainWrite extends BaseClass {
	@Test
	private void Login() {
		setHeader("accept", "application/json");
		addBasicAuth("gowthammech444@gmail.com", "Naughty@2003");
		Response reqType = addReqType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
		int statusCode = statusCode(reqType);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,200, "verify msg");
		
		Login_Output_Pojo login_Output_Pojo = response.as(Login_Output_Pojo.class);
		String first_name = login_Output_Pojo.getData().getFirst_name();	
		
		Assert.assertEquals(first_name, "Gowtham","verify first name");
		String last_name = login_Output_Pojo.getData().getLast_name();
		 Assert.assertEquals(last_name, "Mech","verify last name");
		
	}

}
