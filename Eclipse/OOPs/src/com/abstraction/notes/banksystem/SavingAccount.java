package com.abstraction.notes.banksystem;



public class SavingAccount extends Bank {

	public SavingAccount(int interestRate, int balance) {
		super(interestRate, balance);
	}
	
	@Override
	int  calculateInterest() {
	
		int interest = (balance*interestRate)/100;
		balance += interest;
		
		return interest;
	};
	
}
