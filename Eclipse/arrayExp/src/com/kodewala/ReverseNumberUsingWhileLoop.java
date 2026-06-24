package com.kodewala;

public class ReverseNumberUsingWhileLoop {
	
	public static void reverseNumberUsingWhileLoop(int[] array) {
		
		int start = 0;
		int end = array.length-1;

		while(start<end) {
			
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			
			start++;
			end--;
			
		}
		
		for(int it: array) {
			System.out.print(it+" ");
		}
	
	}

}
