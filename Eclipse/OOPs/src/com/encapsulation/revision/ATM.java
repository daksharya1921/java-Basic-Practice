package com.encapsulation.revision;

public class ATM {
	
	private double balance;
	private String pin ="4235";
	
	public void withdraw(double withdrawAmount, String enteredPin) {
		System.out.println("Cureent Balance:"+balance);
		
		if(pin.equals(enteredPin) && withdrawAmount <= balance) {
			balance -= withdrawAmount;
			System.out.println("Current Balance:"+balance);
		}
		else {
			System.out.println("Incorrect Pin Or Insufficent Balance");
		}
		
	}
	
	public void deposit(double amount, String enteredPin) {
		System.out.println("Cureent  Balance Before Deposit :"+balance);
		
		if(pin.equals(enteredPin) && amount >0) {
			balance += amount;
			System.out.println("Cureent Balance:"+balance);
		}
		else {
			System.out.println("Incorrect Pin or amount is not valid");
		}
	}
	
	

}
