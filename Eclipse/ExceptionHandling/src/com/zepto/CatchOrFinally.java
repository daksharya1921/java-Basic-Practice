package com.zepto;

public class CatchOrFinally {
	public static void main(String[] args) {
		int number = 2;
		try {
			number = 4;
			int value= 5/0;
		}
		catch(ArithmeticException exceptionObject) {
			
			number = 6;
			exceptionObject.printStackTrace();
			System.out.println("Don't divide with /0");
			
		}
		finally {
			number = 8;
			
		}
		
		System.out.println("Number: "+number);
	}

}
