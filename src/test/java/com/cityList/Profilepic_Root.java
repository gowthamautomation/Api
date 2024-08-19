package com.cityList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profilepic_Root {
	private int status;
	private String message;
	private Profilepic_Data data;
	private int cart_count;
}
