package com.listexample.arraylistexample.classcode;

import java.util.ArrayList;
import java.util.List;

public class PrintRElementFromArrayList {
	
	public static void main(String [] args) {
		List<String> name = new ArrayList<String>();
		name.add("Raj");
		name.add("Masood");
		name.add("Raza");
		
		for(int i = 0; i<name.size(); i++) {
			String namep = name.get(i);
			if(namep.startsWith("R")) {
				System.out.println(namep);
			}
		}
	}

}
