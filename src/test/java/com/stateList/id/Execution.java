package com.stateList.id;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cityList.Address_Input_Pojo;
import com.cityList.Address_Output_Pojo;
import com.cityList.City_Id;
import com.cityList.City_Input_pojo;
import com.cityList.City_Output_Pojo;
import com.cityList.Delete_Input_pojo;
import com.cityList.Delete_output_pojo;
import com.cityList.Get_Address_Root;
import com.cityList.Product_Input;
import com.cityList.Product_Output;
import com.cityList.Product_Root;
import com.cityList.Profilepic_Root;
import com.cityList.Update_Input_Pojo;
import com.cityList.Update_Output_Pojo;

import Deserialization.Login_Output_Pojo;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Execution extends BaseClass {
	String logtoken;
	String addressid;
	int intStateid;
	int id;

	@Test(priority = 1)
	public void login() {
		setHeader("accept", "application/json");
		addBasicAuth("gowthammech444@gmail.com", "Naughty@2003");
		Response reqType = addReqType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
		int statusCode = statusCode(reqType);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify the success code");
		Login_Output_Pojo as = reqType.as(Login_Output_Pojo.class);
		String first_name = as.getData().getFirst_name();
		System.out.println(first_name);
		Assert.assertEquals(first_name, "Teekam", "verify the firstname");
		String last_name = as.getData().getLast_name();
		System.out.println(last_name);
		Assert.assertEquals(last_name, "Saini", "verify last name");
		logtoken = as.getData().getLogtoken();
	}

	@Test(priority = 2)
	private void getStateList() {
		setHeader("accept", "application/json");
		Response reqType = addReqType("GET", "https://omrbranch.com/api/stateList");
		int statusCode = statusCode(reqType);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify code");
		StateList_Output_Pojo stateList_Output_Pojo = reqType.as(StateList_Output_Pojo.class);

		// find the state id of TN
		ArrayList<Dataa> statelist = stateList_Output_Pojo.getData();

		// Iterate all list
		for (Dataa dataa : statelist) {

			String eachstatename = dataa.getName();
			intStateid = dataa.getId();
			if (eachstatename.equals("Tamil Nadu")) {
				System.out.println("the tamilnadu id is" + intStateid);
				String Stateid = String.valueOf(intStateid);

				Assert.assertEquals(intStateid, 35, "verify state id is 35");

				break;
			}
		}
	}

	@Test(priority = 3)
	public void getCityList() {
		List<Header> lstheader = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");

		lstheader.add(h1);
		lstheader.add(h2);

		Headers header = new Headers(lstheader);
		addHeaders(header);

		// req body
		City_Input_pojo city_Input_pojo = new City_Input_pojo("35");
		addBody(city_Input_pojo);

		// add reqt
		Response response2 = addReqType("POST", "https://omrbranch.com/api/cityList");
		int statusCode = statusCode(response2);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify status code");

		// find the city id of Yercaud
		City_Output_Pojo as = response2.as(City_Output_Pojo.class);
		ArrayList<City_Id> data = as.getData();

		for (City_Id eachcitylist : data) {
			String name = eachcitylist.getName();
			if (name.equals("chennai")) {
				id = eachcitylist.getId();
				System.out.println(id);
				Assert.assertEquals(id, 3659, "verify city id");
				break;

			}
		}
	}

	@Test(priority = 4)
	public void createAddress() {
		// Headers
		List<Header> lstheader = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);// must give space for bearer
		Header h3 = new Header("Content-Type", "application/json");
		lstheader.add(h1);
		lstheader.add(h2);
		lstheader.add(h3);
		Headers headers = new Headers(lstheader);
		addHeaders(headers);

		// payload or Req body

		Address_Input_Pojo address_input_pojo = new Address_Input_Pojo("Gowtham", "M", "9500613453", "Nextra",
				intStateid, id, 101, "636401", "Salem", "Add");
		addBody(address_input_pojo);
		// add req type
		Response reqType = addReqType("POST", "https://omrbranch.com/api/addUserAddress");
		int statusCode = statusCode(reqType);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify status code");
		Address_Output_Pojo as = reqType.as(Address_Output_Pojo.class);
		int address_id = as.getAddress_id();
		addressid = String.valueOf(address_id);
		System.out.println(address_id);
		String message = as.getMessage();
		System.out.println(message);
		Assert.assertEquals(message, "Address added successfully", "verify address added succesfully");

	}

	@Test(priority = 5)
	 public void updateAddress() {
		 List<Header> lstheaders = new ArrayList<>();
		 Header h1 = new Header("accept", "application/json"); 
		 Header h2 = new Header("Authorization", "Bearer "+logtoken); 
		 Header h3 = new Header("Content-Type", "application/json");
		 lstheaders.add(h1);
		 lstheaders.add(h2);
		 lstheaders.add(h3);
		 Headers headers = new Headers(lstheaders);
		 addHeaders(headers);
		 Update_Input_Pojo uip = new Update_Input_Pojo(addressid,"Gowtham", "M", "9500613453", "Supreme",
					intStateid, id, 101, "636401", "erode", "Add");
		 addBody(uip);
		 Response reqType = addReqType("PUT", "https://omrbranch.com/api/updateUserAddress");
		 int statusCode = statusCode(reqType);
		 System.out.println(statusCode);
		 Assert.assertEquals(statusCode,200, "verify the response code");
		 Update_Output_Pojo as = reqType.as(Update_Output_Pojo.class);
		 String message = as.getMessage();
		 System.out.println(message);
		 Assert.assertEquals(message,"Address updated successfully", "verify the update message");
		 
		  }
	
	@Test(priority = 6)
	public void getAddress() {
		List<Header> lstheaders = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		lstheaders.add(h1);
		lstheaders.add(h2);
		Headers headers = new Headers(lstheaders);
		addHeaders(headers);
		Response reqType = addReqType("GET", "https://omrbranch.com/api/getUserAddress");
		int statusCode = statusCode(reqType);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify the response code");
		Get_Address_Root as = reqType.as(Get_Address_Root.class);
		String message = as.getMessage();
		System.out.println(message);
		Assert.assertEquals(message, "OK", "verify the update message");
		 	

	}


 @Test(priority = 7)
 public void deleteAddress() {
	 List<Header> lstheaders = new ArrayList<>();
	 Header h1 = new Header("accept", "application/json"); 
	 Header h2 = new Header("Authorization", "Bearer "+logtoken); 
	 Header h3 = new Header("Content-Type", "application/json");
	 lstheaders.add(h1);
	 lstheaders.add(h2);
	 lstheaders.add(h3);
	 Headers headers = new Headers(lstheaders);
	 addHeaders(headers);
	 Delete_Input_pojo dl = new Delete_Input_pojo(addressid);
	 addBody(dl);
	 Response reqType = addReqType("DELETE","https://omrbranch.com/api/deleteAddress");
	 int responsecode = statusCode(reqType);
	 System.out.println(responsecode);
	 Assert.assertEquals(responsecode,200, "verify the response code");
     Delete_output_pojo as = reqType.as(Delete_output_pojo.class);
	 String message = as.getMessage();
	 System.out.println(message);
	 Assert.assertEquals(message,"Address deleted successfully", "verify the update message");
	 }
//
	 @Test(priority =8)
	 public void searchProduct() {
		
		 List<Header> lstheaders = new ArrayList<>();
		 Header h1 = new Header("accept", "application/json"); 
		 Header h2 = new Header("Content-Type", "application/json");
		 lstheaders.add(h1);
		 lstheaders.add(h2);
		 Headers headers = new Headers(lstheaders);
		 addHeaders(headers);
		 Product_Input pip = new Product_Input("nuts");
		 addBody(pip);
		 Response reqType = addReqType("POST", "https://omrbranch.com/api/searchProduct");
		 int statusCode = statusCode(reqType);
		 System.out.println(statusCode);
		 Assert.assertEquals(statusCode,200, "verify the response code");
		 Product_Root as = reqType.as(Product_Root.class);
		 String message = as.getMessage();
		 System.out.println(message);
		 ArrayList<Product_Output> data = as.getData();
		for (Product_Output datum : data) {
			System.out.println(datum.getText());
		}
	 }
		@Test(priority=9)
	 	private void changeProfilePic() {
	 		List<Header> lstheaders = new ArrayList<>();
			 Header h1 = new Header("accept", "application/json"); 
			 Header h2 = new Header("Authorization", "Bearer "+ logtoken); 
			 Header h3 = new Header("Content-Type", "multipart/form-data");
			 lstheaders.add(h1);
			 lstheaders.add(h2);
			 lstheaders.add(h3);
			 Headers headers = new Headers(lstheaders);
			 addHeaders(headers);
			 addFormData("profile_picture", new File("C:\\Users\\HARIsh\\eclipse-workspace\\Api\\profilepic\\icons8-java-50.png"));
			 Response addReqType = addReqType("POST", "https://omrbranch.com/api/changeProfilePic");
			 int statusCode =statusCode(addReqType);
			 System.out.println(statusCode);
			 Assert.assertEquals(statusCode,200, "verify the response code");
			Profilepic_Root as = addReqType.as(Profilepic_Root.class);
			String message2 = as.getMessage();
			System.out.println(message2);
			Assert.assertEquals(message2, "Profile updated Successfully", "verify the update message");
			
		}
	
}	
	
	



