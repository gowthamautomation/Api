package com.cityList;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Get_Address_Root {
	 private int status;
	    private String message;
	    private ArrayList<GetAddress_Data> data;
}
