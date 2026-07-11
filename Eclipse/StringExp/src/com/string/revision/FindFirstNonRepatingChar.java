package com.string.revision;

import java.util.Scanner;

public class FindFirstNonRepatingChar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
//		char[] inputInToChar = input.toCharArray();
//		
//		for(char it : inputInToChar) {
//			if(input.indexOf(it) == input.lastIndexOf(it) ) {
//				System.out.println	(it);
////				break;
//			}
//		}
		
		System.out.println(input.substring(5));
		System.out.println(input.substring(5,9));
		//System.out.println(input.subSequence(0, 0));
		
		
		scanner.close();
	}

}
