package org.firstClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TaskOne {
	public static void main(String[] args) throws IOException, ParseException {
		//1.Menton the path of json
		FileReader filereader = new FileReader(
				"C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\resources\\tsak1.jason");
		//2.Create the object for json object class
		JSONParser json = new JSONParser();
		//3.pass the json file to fetch values
		Object parse = json.parse(filereader);
		JSONObject j = (JSONObject) parse;

		Object o = j.get("data");
		System.out.println("data");
		JSONObject j1 = (JSONObject) o;
		Object o1 = j1.get("id");
		System.out.println(o1);
		Object o2 = j1.get("flightName");
		System.out.println(o2);
		Object o3 = j1.get("Country");
		System.out.println(o3);
		Object o4 = j1.get("Destinations");
		System.out.println(o4);
		Object o5 = j1.get("URL");
		System.out.println(o5);
		Object o6 = j1.get("Created_Date");
		System.out.println(o6);
		Object o7 = j1.get("Updated_Date");
		System.out.println(o7);

		Object o8 = j.get("support");
		System.out.println("support");
		JSONObject object = (JSONObject) o8;
		Object ob1 = object.get("url");
		System.out.println(ob1);
		Object ob2 = object.get("text");
		System.out.println(ob2);
		
		
		
		

	}

}
