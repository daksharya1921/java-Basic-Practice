package com.returnasarray;

public class ReverseNumber {
	
	public static int[] reverseNumberUsingWhileLoop(int[] number) {
		
		int start = 0;
		int end = number.length-1;
		
		while(start<end) {
			
			int temp = number[start];
			number[start] = number[end];
			number[end] = temp;
			
			
			start++;
			end--;
		}
		
		return number;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] reverseNumberUsingForLoop(int[] number) {
		
		for(int index = 0; index<=number.length/2; index++) {
			
			int temp = number[index];
			number[index] = number[number.length-index-1];
			number[number.length-index-1]= temp;
			
			
		}
		return  number;
	}

}
