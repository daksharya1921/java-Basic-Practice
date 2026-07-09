package com.oops.encapsulation.liveclass.bank;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account acc = new Account();
		
		
		
		System.out.println("Please provide the Input: ");
		
		int input = scanner.nextInt();
		scanner.nextLine();
		
		
		
		while (input != 5) {
			
			System.out.println("Pleas provide Input : ");
			int i = scanner.nextInt();
			scanner.nextLine();
			
			switch (i) {
			case 1:
				System.out.println("Please Provide Balance:");
				double balance = scanner.nextDouble();
				scanner.nextLine();
				acc.setBalance(balance);
				break;
			case 2:
				System.out.println("Withdrawal Amunt:");
				double withdraw = scanner.nextDouble();
				scanner.nextLine();
				acc.setWithdraw(withdraw);
				break;
			case 3:
				System.out.println("Deposit Amunt:");
				double deposit = scanner.nextDouble();
				scanner.nextLine();
				acc.setDeposit(deposit);
				break;
				
			case 4 :
				input = 5;
				break;
				
			default: 
				System.out.println("Please Provide VAlid data ");
				break;
			}
			
		}
		
		System.out.println( "Exit");

		scanner.close();
	}

}
