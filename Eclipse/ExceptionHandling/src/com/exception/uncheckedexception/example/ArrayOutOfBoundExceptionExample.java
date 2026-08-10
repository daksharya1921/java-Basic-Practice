package com.exception.uncheckedexception.example;

public class ArrayOutOfBoundExceptionExample {
	
	public static void main(String[] args) {
		
		try {
		int [] arr = {342,342,234};
		int number = arr[6];  //ArrayIndexOutOfBoundsException
		System.out.println(number);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Error: Index is out of bounds.");
		}
		
	}

}
