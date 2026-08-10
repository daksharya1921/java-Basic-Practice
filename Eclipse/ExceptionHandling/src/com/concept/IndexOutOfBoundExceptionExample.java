package com.concept;

public class IndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		//int p[] = { 1, 2, 3 };
		//int value = p[3];
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
		 * out of bounds for length 3 at
		 * com.concept.IndexOutOfBoundExceptionExample.main(
		 * IndexOutOfBoundExceptionExample.java:7)
		 * 
		 */
		
		String  stg = new String("Daksh");
		char c = stg.charAt(5);
	}
}
