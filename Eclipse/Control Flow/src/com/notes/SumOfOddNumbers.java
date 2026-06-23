package com.notes;

public class SumOfOddNumbers {
	
	private int sumOdd(int number) {
		int sum = 1;
		for(int i = 2; i<= number; i++) {
			if(i % 2 != 0)
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		SumOfOddNumbers s = new SumOfOddNumbers();
		
		System.out.println( s.sumOdd(8));
		
	}

}
