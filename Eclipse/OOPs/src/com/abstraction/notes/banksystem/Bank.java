package com.abstraction.notes.banksystem;

public abstract class Bank {
	int interestRate;
	int balance;
	public Bank(int interestRate2, int balance2) {
		this.balance=balance2;
		this.interestRate= interestRate2;
	}
	abstract int  calculateInterest();

	void displayBalance() {
		System.out.println("Balance: "+balance);
	}
}
