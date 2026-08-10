package com.exception.classnotes1;

/*
 * Try{
 *   Risky code
 * 
 * }
 * catch(exception e){
 * catch exception
 * }
 */

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("Driver.main() ->> START");
		
		try {
		//String name = "Daksh";
//		String name = null;
//		int length = name.length();  // null.length -> NullPointerException throw after that no more code excute 
//		// when exception come and don't handle properly with will end abnormally
//		// so we uses try Catch to handle this 
//		System.out.println(" "+length);
		
		String first = args[0];  // if we dont provide input it will throw ArrayIndexOutOfBoundsException
		int num = first.length();
		System.out.println(num);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Name is NULL");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());		
			System.out.println("Trying to access which is not present in arr");
		}
		System.out.println("Driver.main() ->> END");
		
	}

}
