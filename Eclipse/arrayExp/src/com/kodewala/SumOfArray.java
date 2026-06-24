package com.kodewala;

public class SumOfArray {
	
	public static double sumArray(int[] arr) {
		
		
		
		
//		System.out.print("Array : [");
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i == (arr.length-1) ) break;
//			else System.out.print(",");
//		}
//		System.out.println("]");
		
		double sum =0;
		for(int i= 0; i<arr.length;i++) {
			sum += arr[i];
		}
		
		//System.out.println("Sum Of array: "+sum);
		return sum;
	}

	public static void main(String[] args) {
		
int arr[] = new int[5];
		
		arr[0]= 21;
		arr[1]= 351;
		arr[2]= 1;
		arr[3]= 35;
		arr[4]= 210;
		
		System.out.println(SumOfArray.sumArray(arr));
	}

}
