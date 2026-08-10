package com.concept;

public class ClassCastExceptionExample {
	public static void main(String[] args) {

		Object value = 0;
		System.out.println((String) value);
		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer
		 * and java.lang.String are in module java.base of loader 'bootstrap') at
		 * com.concept.ClassCastExceptionExample.main
		 */
	}

}
