package com.string.tpoints;

public class StringExmple5 {

	public static void main(String[] args) {
		
		
		String firstName = "Daksh";
		String lastName = "Arya";
		String a = "Singh";
		
		String fullName = String.join("@",firstName,lastName,a);

		System.out.println("Full Name: "+fullName);
	}

}
