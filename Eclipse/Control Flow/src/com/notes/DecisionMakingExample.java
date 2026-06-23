package com.notes;

public class DecisionMakingExample {
	
	private static void isPostive(int number) {
		if(number > 0) {
			System.out.println("The Number is Positive");
		}
		else  {
			System.out.println("The Number is not Positive");
		}
	}
	
	public static void main(String[] args) {
		
//		int number = -5;
		
		int number = Integer.parseInt(args[0]);
		
		isPostive(number);
	}
}
