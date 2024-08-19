package org.firstClass;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class New {
public static void main(String[] args) throws IOException, ParseException {
	//1.Menton the path of json
	FileReader f=new FileReader("C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\resources\\new.jason");
	//2.Create the object for json object class
	JSONParser jp=new JSONParser();
	//3.pass the json file to fetch values
	Object object = jp.parse(f);
	
	JSONObject jo=(JSONObject)object;
	Object object2 = jo.get("email");
	String s=(String)object2;
	System.out.println(s);
	
	
}
}
