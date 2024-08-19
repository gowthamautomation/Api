package org.jsonArray;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class sample {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader(
				"C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\resources\\jsonarray.jason");
		JSONParser jp = new JSONParser();
		Object object = jp.parse(file);
		
		JSONObject jo=(JSONObject)object;
		Object object2 = jo.get("courses");
		System.out.println(object2);
		JSONArray ja=(JSONArray)object2;
		for (int i = 0; i < ja.size(); i++) {
			Object object3 = ja.get(i);
			System.out.println(object3);
			
			
		}
		
		
		
		
	}
}