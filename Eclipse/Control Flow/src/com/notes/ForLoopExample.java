package com.notes;

public class ForLoopExample {

	private static void printTableUsingForLoop(int number) {
		
		for(int index = 1; index<=10; index++) {
			System.out.println(number+" * "+index+" = "+number*index);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printTableUsingForLoop(5);
	}

}
