package com.revision.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class CityService {
	
	public ArrayList addCity() 
	{
	
		List<String> s = new ArrayList<String>();
		
		s.add("Mumbai");
		s.add("Patna");
		s.add("Kolkata");
		s.add("Banglore");
		s.add("Mumbai");
		s.add("Mysore");
		
		return (ArrayList)s;
		
	}

}
