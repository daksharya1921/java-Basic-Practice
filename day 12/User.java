/* Write a program that asks the user to enter a username.

The username must contain only letters and digits.

If invalid, print "Invalid username! Try again." and keep asking until valid.

Once valid, print "Welcome, <username>!". */

import java.util.Scanner;

class User{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Plese Provide User name:");
		
		while(!scanner.hasNext("[a-zA-Z0-9]+") || scanner.next().trim().isEmpty()){
			System.out.println("Invalid username! Try again.");
			scanner.next();
		}
		String userName = scanner.next();
		System.out.println("Welcome, "+userName+"!");
		
		
		
	}

}