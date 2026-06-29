package com.sorting;



public class Driver {

	private static void printReturnAsArray(int[] array) {

		// int[] print =ReverseNumber.reverseNumberUsingForLoop(array);

		//int[] print = SelectionSort.sortSelection(array);
		int[] print = BubbleSort.sortBubble(array);

		for (int it : print) {
			System.out.print(it + " ");
		}

	}
	
	public static void main(String[] args) {
		
		
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
		
		Driver.printReturnAsArray(number);
	}

}
