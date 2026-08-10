package com.listexample.arraylistexample.tpoint;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MainApp {

	public static void main(String[] args) 
	{
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Mango");  
		nameList.add("Apple");  
		nameList.add("Banana");  
		nameList.add("Grapes");  
		
		Collections.sort(nameList);
		
		for(String fruit: nameList) {
			System.out.println(fruit +" " );
		}
	  
	}
}
