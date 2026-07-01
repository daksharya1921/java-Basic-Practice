package com.string.notes;

public class StringsExample2 {

	public static void main(String[] args) {
		
		// Using new Keyword to Create String object on the heap
		String s1 = new String("Daksh"); // its will create 2 object one in heap + Scp
		
		String s2 = new String("Daksh"); // its will create only one object i.e in Heap
		
		System.out.println("s2 == s1 :" + (s2 == s1)); // false cuz its will refer to heap which is both refer to other
														// s1 is different and s2 is different
		
		System.out.println("s2.equals(s1) :" + s2.equals(s1)); // its will true cuz its only checking the value (content
																// of String) nor reference address

	}

}
