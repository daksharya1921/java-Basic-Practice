package com.string.bufferbuilderexample;

public class CheckPalindrome {

	
	boolean isPalindrome(String name) {
		
		boolean status = false;
		
		StringBuffer fName = new StringBuffer(name);
		 fName.reverse();
		 
		 if(name.toString().equals(fName.toString())) {
			 status = true;
		 }
		
		 return status;
		
	}
	
	public static void main(String[] args) {
		
		CheckPalindrome cp  = new CheckPalindrome(); 
		
		boolean result = cp.isPalindrome("MADAM");
		
		System.out.println("isPalindrome "+result);
		
	}

}
