package org.writeValue;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PojoMain {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<Details> data;
	private Support support;

	
}



	
	
	
	
	
	
	
	
	

