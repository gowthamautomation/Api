package org.firstClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Nested {
	public static  void main(String[] args) throws IOException, ParseException {
		FileReader filereader=new FileReader("C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\resources\\nested.jason");
		
		JSONParser jp=new JSONParser();
		
		Object object = jp.parse(filereader);
		
		JSONObject j=(JSONObject)object;
		Object object2 = j.get("name");
		System.out.println(object2);
		
		JSONObject jo=(JSONObject)object;
		Object object3 = jo.get("address");
		
		JSONObject jo1=(JSONObject)object3;
		Object object4 = jo1.get("streetName");
		System.out.println(object4);
		
		
}

}
