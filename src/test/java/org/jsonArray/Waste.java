package org.jsonArray;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Waste {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader(
				"C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\resources\\TuesdayTask1.json");
		JSONParser jg = new JSONParser();
		Object object = jg.parse(file);

		JSONObject jo = (JSONObject) object;
		Object object2 = jo.get("page");
		System.out.println(object2);

		Object object3 = jo.get("per_page");
		System.out.println(object3);

		Object object4 = jo.get("total");
		System.out.println(object4);

		Object object5 = jo.get("total_pages");
		System.out.println(object5);
		System.out.println("data");
// data
		Object Data = jo.get("data");
		JSONArray ja = (JSONArray) Data;
		for (int i = 0; i < ja.size(); i++) {
			Object object7 = ja.get(i);
			
			JSONObject jo1=(JSONObject)object7;
			Object object8 = jo1.get("id");
			System.out.println(object8);
			
			Object object9 = jo1.get("flightName");
			System.out.println(object9);
			
			Object object10 = jo1.get("Country");
			System.out.println(object10);
			
			Object object11 = jo1.get("Destinations");
			System.out.println(object11);
			
			Object object12 = jo1.get("URL");
			System.out.println(object12);
		}
		
		
			System.out.println("support");
	//support
			Object support = jo.get("support");
			JSONObject job2=(JSONObject)support;
			Object ob1 = job2.get("url");
			System.out.println(ob1);
			Object ob2 = job2.get("text");
			System.out.println(ob2);
			
			
			
			
			
			
			
			
			
			
			
			

		}

	
}
