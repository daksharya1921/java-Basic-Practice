package com.kodewala;

public class ReverseArray {

	
	
	public static void arrayReverseUsingForLoop(int[] array) {
		
		
		
		for(int index = 0  ; index < array.length/2; index++) {
			
			int temp = array[index];
			array[index] = array[array.length-1-index];
			array[array.length-1-index]= temp;
		}
		
		
		for(int it : array) {
			System.out.print(it+" ");
					}
		
	}
	
	
	
}
