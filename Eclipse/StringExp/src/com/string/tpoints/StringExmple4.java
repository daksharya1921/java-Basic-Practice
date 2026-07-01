package com.string.tpoints;

public class StringExmple4 {

	public static void main(String[] args) {
		
		String inital = "Mr";
		String firstName = " Daksh";
		String lastName = " Arya";
		
		String fullName = inital.concat(firstName).concat(lastName);
		System.out.println("Full Name:"+fullName); //Mr Daksh Arya

	}

}
