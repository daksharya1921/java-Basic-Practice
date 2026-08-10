package com.listexample.arraylistexample.tpoint;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) 
	{
	
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		System.out.println("Returning elements: "+list.get(1));
		
		list.add(1,"Dates");
		
		for(String fruit: list) 
		{
			System.out.println(fruit);
		}
	}
	

}
