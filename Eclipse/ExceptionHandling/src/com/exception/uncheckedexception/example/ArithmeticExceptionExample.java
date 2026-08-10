package com.exception.uncheckedexception.example;

public class ArithmeticExceptionExample {
	
	private static int value;
	
	public static void main(String[] args) {
		
		try {
		int number = 5;
		
		int result = number/value;
		System.out.println(result);
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Error: Division by zero is not allowed.");
		}
		
		
	}

}
