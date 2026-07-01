package com.string.notes;

public class StringsExample1 {

	public static void main(String[] args) {
		
		String s1 = "Kodewala"; // one object will create in s1 
		String s2 = "Kodewala"; // its will refer to same obj in scp 
		String s3 = "Kodewala"; // its will refer to same obj in scp
		
		System.out.println("s1 == s2 :"+(s1 == s2)); // true
		System.out.println("s1 == s3:"+(s1 == s3)); // true
		

	}

}
