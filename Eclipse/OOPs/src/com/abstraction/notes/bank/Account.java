package com.abstraction.notes.bank;

public abstract class Account {

	 double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	abstract void calculateInterest();
	
	void showBalance() {
		System.out.println("Current Balance: "+balance);
	}
}
