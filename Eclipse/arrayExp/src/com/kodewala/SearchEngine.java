package com.kodewala;

public class SearchEngine {

	
	public static boolean isAvaiable(int[] array ) {
		
		int searchNumber = 45;
		for(int index = 0; index < array.length; index++) {
			if(array[index] == searchNumber) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] number = new int[10];
		
		number[0]= 21;
		number[1]= 221;
		number[2]= 45;
		number[3]= 71;
		number[4]= 87;
		number[5]= 89;
		number[6]= 123;
		number[7]= 675;
		number[8]= 234;
		number[9]= 2265;
		
		 
		
		//System.out.println("If number is present true/false::"+isAvaiable(number));
		
		//ReverseArray.arrayReverseUsingForLoop(number);
		
		ReverseNumberUsingWhileLoop.reverseNumberUsingWhileLoop(number);

	}

}
