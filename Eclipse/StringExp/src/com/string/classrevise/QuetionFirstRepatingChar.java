package com.string.classrevise;

public class QuetionFirstRepatingChar {

	public static void main(String[] args) {

		String input1 = "prya";
		
		char[] inputArray1 = input1.toCharArray();
		
		for(int index = 0; index < inputArray1.length; index++) {
			char currentIndex = inputArray1[index];
			if(input1.indexOf(currentIndex) != input1.lastIndexOf(currentIndex)) {
				System.out.println(currentIndex);
				break;
			}
		}

	}

}
