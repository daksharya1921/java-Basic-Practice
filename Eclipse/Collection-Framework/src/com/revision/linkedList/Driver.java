package com.revision.linkedList;

import java.util.LinkedList;
public class Driver {
	
	public static void main(String[] args) 
	{
		CityService cs = new CityService();
		System.out.println(cs.addCity());
		
	//	String s = (String) cs.addCity().get(3);n
		
		LinkedList<String> s = new LinkedList<String>();
		
		s.addAll(cs.addCity());
		
		String delStr = (String)s.remove(3);
		
		System.out.println("*******After Remove of the index 3***********");
		
		System.out.println(s);
	}

}
