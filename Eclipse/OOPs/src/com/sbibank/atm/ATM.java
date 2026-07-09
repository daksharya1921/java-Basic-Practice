package com.sbibank.atm;

public class ATM {
	
	private double balance = 1000.00;
	private String pin = "4563";
	
	// 
	public void setWithdrawl(double amountToWithdraw, String enteredPin) {
		
		System.out.println("Currernt balance : "+ balance);
		if(enteredPin.equals(pin) && amountToWithdraw <= balance) {
			balance -= amountToWithdraw;
			
			System.out.println("Balance after Withdrawl: "+ balance);
		}
		else {
			System.out.println("Error: Incorrect PIN or insufficent funds.");
		}
		
		
	}
	
	public void deposit(double amountToDeposit, String enteredPin) {
		if(enteredPin.equals(pin)) {
			balance += amountToDeposit;
			System.out.println("Balance after Deposit:"+balance);
		}
		else {
			System.out.println("Incorrect Pin. ");
		}
	}

}
