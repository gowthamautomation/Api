package com.cityList;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product_Root {
	 private int status;
	    private String message;
	    private ArrayList<Product_Output> data;
	    private String currency;
}
