package com.cityList;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product_Output {
	private String image;
    private String type;
    private String text;
    private int id;
    private int category_id;
}
