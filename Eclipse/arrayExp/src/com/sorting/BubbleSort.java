package com.sorting;

//import java.util.Iterator;

public class BubbleSort {

	private static void swapping(int[] array,int index2 ,int index3) {
		int temp = array[index2];
		array[index2]= array[index3];
		array[index3]= temp;
	}
	
	public static int[] sortBubble(int[] array) {
		
		for(int index1=array.length-1; index1 >= 1; index1--) {
			for(int index2 = 0; index2 <=index1-1; index2++) {
				if(array[index2] > array[index2+1]) {
					
					swapping(array,index2,(index2+1));
				}
					
			}
		}
		
		return array;
	}
}
