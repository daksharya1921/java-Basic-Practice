package com.string.notes;

import java.util.Scanner;

public class CheckWords {
	
	public void checkContainThisWords(String input) {
		
		String isWordsMatch = "Daksh";
		System.out.println(input.contains(isWordsMatch));
	}
	
	public void checkContainThisLetters(String input) {
		
		char isCharMatch = 'a';
		
		System.out.println(input.contains(Character.toString(isCharMatch)));
		
		//System.out.println(input.contains(String.valueOf(isCharMatch)));
	}
	
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CheckWords cw = new CheckWords();
		
		System.out.println("Enter Your Sentence ");
		String input = scanner.nextLine();
		
		// cw.checkContainThisWords(input);
		cw.checkContainThisLetters(input);

		scanner.close();

	}

}
