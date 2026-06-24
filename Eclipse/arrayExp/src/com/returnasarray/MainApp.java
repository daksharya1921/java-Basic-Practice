package com.returnasarray;

public class MainApp {

	
	private static void printReturnAsArray(int[] array) {
		
		//int[] print =ReverseNumber.reverseNumberUsingForLoop(array);
		
		int[] print = ReverseNumber.reverseNumberUsingWhileLoop(array);
		
		for(int it : print) {
			System.out.print(it+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];

			number[0] = 21;
			number[1] = 221;
			number[2] = 45;
			number[3] = 71;
			number[4] = 87;
			number[5] = 89;
			number[6] = 123;
			number[7] = 675;
			number[8] = 234;
			number[9] = 2265;
			
			MainApp.printReturnAsArray(number);
		
	}

}
