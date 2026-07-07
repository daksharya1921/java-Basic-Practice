package com.string.notes;

import java.util.Scanner;

public class ToDoList2 {
	
	void appendTheToDoList(String s1,String s2, String s3) {
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StringBuffer s1 = new StringBuffer("1.Buy groceries");
		StringBuffer s2 = new StringBuffer("2.Finish HomeWork");
		StringBuffer s3 = new StringBuffer("3.Call the plumber");
		
		System.out.println("Press Buttons for opertion in TO DO List");
		System.out.println("Press 1 for Append Or ADD Things in To DO List");
		System.out.println("Press 2 for Update in To DO List");
		System.out.println("Press 3 for Delete in To DO List");
		System.out.println("Press 4 for Print the To DO List");
		System.out.println("Press 5 for Exit in To DO List");
		
		
		int value = scanner.nextInt();
		scanner.nextLine();
		
		
		while(value != 5) {
			
			switch (value) {
			case 1:
				
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			

			default:
				break;
			}
			
		}
		
		
		
		scanner.close();

	}

}
