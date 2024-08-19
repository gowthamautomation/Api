package com.cityList;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City_Output_Pojo {
	private int status;
    private String message;
    private ArrayList<City_Id> data;
}
