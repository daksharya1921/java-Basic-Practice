package com.notes;

public class PositiveNumberCheck {

	private static void checkIfNumber(int number) {
		if(number > 0) {
			System.out.println("THis number is positive");
		}
	}
	
	public static void main(String[] args) {
		
//		int number = 10;
		
		int number = Integer.parseInt(args[0]);
		
		checkIfNumber(number);
		

	}

}
