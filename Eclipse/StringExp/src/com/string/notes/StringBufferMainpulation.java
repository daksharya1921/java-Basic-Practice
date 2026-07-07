package com.string.notes;

public class StringBufferMainpulation {

	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("Daksh ");
		System.out.println("-------------------------------------------------");
		System.out.println("After appends Arya");
		
		name.append("Arya");
		System.out.println(name);
		System.out.println("-------------------------------------------------");
		System.out.println("After Insert Mr in index 0");
		name.insert(0, "Mr ");

		System.out.println(name);
		System.out.println("-------------------------------------------------");
		System.out.println("After delete  index 0 to 2");
		name.delete(0, 2);
		System.out.println(name);
		System.out.println("-------------------------------------------------");
	}

}
