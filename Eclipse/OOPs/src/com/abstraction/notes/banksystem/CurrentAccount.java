package com.abstraction.notes.banksystem;

public class CurrentAccount extends Bank {

	public CurrentAccount( int balance) {
		super(0, balance);
	}
	
	@Override
	int  calculateInterest() {
	
		int interest = (balance*interestRate)/100;
		balance += interest;
		
		return interest;
	};
}
