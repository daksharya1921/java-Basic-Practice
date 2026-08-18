package com.listexample.arraylistexample.tpoint;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		List<String> fruitsName = new ArrayList<>();
		fruitsName.add("Mango");
		fruitsName.add("Apple");
		fruitsName.add("Banana");
		fruitsName.add("Grapes");

		System.out.println(fruitsName.get(3));
//		fruitsName.set(3, "Lichi"); -> this will remove present elements and this elements in the position
		
		
		Collections.sort(fruitsName);
		for (String fruit : fruitsName) {
			System.out.println(fruit);
		}
	}
}
