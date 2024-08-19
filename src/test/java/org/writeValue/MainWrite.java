package org.writeValue;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainWrite {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
	File f=new File("C:\\Users\\HARIsh\\eclipse-workspace\\Api\\src\\test\\java\\org\\writeValue\\file44.json");	
		
	ObjectMapper ob=new ObjectMapper();
	
	
	ArrayList<Details>data=new ArrayList<Details>();
		Details d=new Details(3,"AirIndia","India","58", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Details d1=new Details(18,"AirIndia","India", "55", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Details d2=new Details(22,"AirSara","India", "608", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Details d3=new Details(33,"AirIndia","India", "20", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Details d4=new Details(36,"Srilankan AriLines","India", "56", "https:\\/\\/en.wikipedia.org\\/wiki\\/Sri_Lanka");
		Details d5=new Details(42,"AirIndia.Raj","India", "98", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");

		data.add(d);
		data.add(d1);
		data.add(d2);
		data.add(d3);
		data.add(d4);
		data.add(d5);
		
		Support support=new Support("https:\\/\\/omrbranch.com","For Joining Automation Course, Please Contact-Velmurugan 9944152058");
		
	PojoMain poj=new PojoMain(1,20,30,40,data,support);
		ob.writeValue(f, poj);

	}
		
		
		
	
	
	
	
	
	
	
}
