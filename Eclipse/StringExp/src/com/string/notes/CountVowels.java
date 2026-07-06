package com.string.notes;

import java.util.Scanner;

public class CountVowels {

	void  countVowels(char[] inputArray) {
		
		char [] output;
		
		for(int index = 0; index < inputArray.length; index++) {
			char currentInput = inputArray[index];
			if(currentInput == 'A' || currentInput == 'a' || currentInput == 'E' ||
					currentInput == 'e' || currentInput == 'I' || currentInput == 'i' ||
					currentInput == 'O' ||currentInput == 'o' ||currentInput == 'U' || currentInput == 'u' )
			{
				System.out.println(currentInput);
				
			}
		}
	
		//return outputArrray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		CountVowels cv = new CountVowels();
		System.out.println("Please Provide the String Input:");
		
		String input = scanner.nextLine();
	
		char[] inputArray = input.toCharArray();
		
		 cv.countVowels(inputArray);
		
		
		
		scanner.close();
		
	}

}
