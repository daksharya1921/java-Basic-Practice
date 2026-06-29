package com.sorting;

public class SelectionSort {
	
	private static void swapping(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
		//return a,b;
	}
	
	public static int[] sortSelection(int[] array) {
		
		for(int index1 = 0; index1<=array.length-2; index1++) {
			
			int mini =index1;
			
			for(int index2 = index1+1; index2 <array.length-1; index2++ ) {
				
				if(array[index2]< array[mini] ) mini = index2;
				
				
			}
			SelectionSort.swapping(array, mini,index1);
		}
		
		return array;
		
	}
}
