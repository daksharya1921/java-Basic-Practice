package com.exception;



/*
 * Exception Handling we use for handle risky code 
 * hierchery -> 
 * 	Throwable
 * r
 */

/*
 * Unchecked Exception we handle at Runtime its optional
 */



public class UncheckedException {

	public static void main(String[] args) {
		
		System.out.println("Main Method START here->>>");
		
		
		try {
		String name = null;
		int length = name.length(); // if name is null then its will throw NullPointerException
		System.out.println("Length: "+length);  
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
			System.err.println("ERROR: -> name String is null,Please provide Some String value to avoid the NullPointerException");
		}
		
		try {
			int[] arr = {2,3,4,5,6,};
			int value = arr[6];  // this will throw an Exception ArrayIndexOutOfBoundException cuz its not present in the given Array
			System.out.println(value);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println("ERROR: -> Trying to access array which is Not availble");
		}
		
		try {
			int zeroValue = 0;
			int number = 6;
			int result = number/zeroValue; // this will throw an Exception cuz if we try to divide any number by 0 its will give an ArthmethicException 
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.err.println("ERROR: -> You are trying to divide NUMBER by ZERO");
		}
		
		
		
		
		System.out.println("Main Method END here ->>>");
		
	}
}
