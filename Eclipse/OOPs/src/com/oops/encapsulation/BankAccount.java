package com.oops.encapsulation;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double _balance) {
		
		this.balance = _balance;
		
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void setDeposit(double amount) {
		
		if(amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("Invalid amount!!");
		}
	}
	
	public void setWithdrawl(double amount) {
		
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
		else {
			System.out.println("Insufficents balace or Invalid Amount");
		}
	}
	
	
	

}
