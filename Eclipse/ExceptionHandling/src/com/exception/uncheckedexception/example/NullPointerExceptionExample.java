package com.exception.uncheckedexception.example;

public class NullPointerExceptionExample {
	
	public static void main(String[] args) {
		
		try {
		String name = null;
		int length = name.length();
		System.out.println(length);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Error: Null Reference encounter");
		}
	}

}
