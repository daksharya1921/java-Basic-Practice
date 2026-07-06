package com.variable;

public class StringExample {

	public static void main(String[] args) {
		//String are immutable ->                                                                                         
		//String literals -> "hello" -> goes in scp
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1.equals(s2)); // true cuz its checks value not reference
		System.out.println(s1 == s2 ); // true cuz its checks the reference address
		
		String s3 = new String("Hello");

		System.out.println(s1.equals(s3)); // true cuz its checks the value 
		System.out.println(s1 == s3 ); // false cuz its checks the reference address and s1 is referring  in scp   and s3 -> referring to heap present in 
 	}

}
