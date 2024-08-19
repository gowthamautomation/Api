package org.jsonArray;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class Datum {
	    public int id;
	    public String flightName;
	    @JsonProperty("Country") 
	    public String country;
	    @JsonProperty("Destinations") 
	    public String destinations;
	    @JsonProperty("URL") 
	    public String uRL;
	}




	
	


