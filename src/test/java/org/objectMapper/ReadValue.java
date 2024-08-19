package org.objectMapper;

import java.io.File;
import java.io.IOException;

import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.val;

public class ReadValue {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f=new File("C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\resources\\pojoReadValue.json");
		
		ObjectMapper ob=new ObjectMapper();
		
		PojoReadValue value = ob.readValue(f, PojoReadValue.class);
		String name = value.getName();
		String email = value.getEmail();
		long phoneno = value.getPhoneno();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phoneno);

		Address address = value.getAddress();
		String streetname = address.getStreetname();
		String statename = address.getStatename();
		int pincode = address.getPincode();
		
		System.out.println(statename);
		System.out.println(streetname);
		System.out.println(pincode);

		
		
		
		
		
	}

}
