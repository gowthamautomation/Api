package org.jsonArray;

import java.util.ArrayList;

import lombok.Data;
@Data
public class Root {
	public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<Datum> data;
    public Support support;
}
