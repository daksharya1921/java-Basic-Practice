package com.kodewala;

import java.util.Scanner;

public class ConvertToUpperCase {

	
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array");
		int sizeOf = scanner.nextInt();
		
		
		printArray(sizeOf);
		

	}

	static void printArray(int size) {

		String name[] = new String[size];

		System.out.println("Enter the Name");

		for (int index = 0; index < size; index++) {
			name[index] = scanner.nextLine();
		}

		for (int i = 0; i < size; i++) {

			String capitalName = name[i].toUpperCase();
			String lowerName = name[i].toLowerCase();//

			System.out.println("Capital Name::" + capitalName);
			System.out.println("Lower Name::" + lowerName);

		}
	}
	

}








///
