package com.revision.linkedList;

import java.util.List;
import java.util.LinkedList;

public class CityService {

	public  LinkedList addCity() 
	{
		List<String> cities = new LinkedList<String>();
		
		cities.add("Bangalore");
		cities.add("Chennai");
		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Mumbai");
		
		return (LinkedList)cities;
	}
}
