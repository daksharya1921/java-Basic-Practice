package com.kodewala;

public class Average {

	
	public static void averageOfNumber(int[] number) {
		
		double result = (double) ((SumOfArray.sumArray(number))/number.length);
		System.out.println("Average::"+result);
	}
	
	
	
	public static void main(String[] args) {
		
		int number[] = new int[4];
		
		number[0] = 9;
		number[1] = 8;
		number[2] = 7;
		number[3] = 6;
		
		Average.averageOfNumber(number);

	}

}
