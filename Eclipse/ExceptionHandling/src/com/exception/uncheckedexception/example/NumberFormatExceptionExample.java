package com.exception.uncheckedexception.example;

public class NumberFormatExceptionExample {
	
	public static void main(String args[]) {
		
		try {
		String firstName = "Daksh";
		int num = Integer.parseInt(firstName);  //NumberFormatException
		System.out.println(num);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Error: Unable to parse the string as an integer.");
		}
	}

}
