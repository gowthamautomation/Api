package org.jsonArray;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TuesdayTask2 {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f = new File("C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\resources\\TuesdayTask1.json");

		ObjectMapper om = new ObjectMapper();

		Root value = om.readValue(f, Root.class);

		System.out.println(value.getPage());
		System.out.println(value.getPer_page());
		System.out.println(value.getTotal());
		System.out.println(value.getTotal_pages());
		System.out.println("data");

		ArrayList<Datum> data = value.getData();
		for (Datum d : data) {
			System.out.println(d.getId());
			System.out.println(d.getFlightName());
			System.out.println(d.getCountry());
			System.out.println(d.getDestinations());
			System.out.println(d.getURL());
			System.out.println("support");
		}		
	Support support = value.getSupport();
			System.out.println(support.getUrl());
			System.out.println(support.getText());
			
			
			
			

		

	}

}
