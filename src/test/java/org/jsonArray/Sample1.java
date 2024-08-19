package org.jsonArray;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample1 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader file=new FileReader("C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\resources\\sample1.jason");
		JSONParser jg=new JSONParser();
		Object object = jg.parse(file);
		
		JSONObject jk=(JSONObject)object;
		Object object2 = jk.get("employees");
		JSONArray ja=(JSONArray)object2;
		
		for (int i = 0; i <ja.size(); i++) {
			Object object3 = ja.get(i);
			JSONObject m=(JSONObject)object3;
			Object object4 = m.get("course");
			System.out.println(object4);
//						
			Object object5 = m.get("Firstname");
			System.out.println(object5);
//			
			
			
			
			
		}
		
		
		
		
		
	}

}
