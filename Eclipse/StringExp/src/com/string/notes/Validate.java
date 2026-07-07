package com.string.notes;

import java.util.Scanner;

public class Validate {
	
	void isValidate(String input) {
		
		if(input.startsWith("IMG_") && input.endsWith(".jpg")) {
			System.out.println("Its valid");
		}
		else {
			System.out.println("Its not valid");
		}
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validate v = new Validate();
		
		System.out.println("PLease Provide ur image:");
		String input = scanner.nextLine();
		v.isValidate(input);
		
		
		scanner.close();

	}

}
