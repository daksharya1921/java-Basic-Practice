package com.abstraction.notes.bank;

public class CurrentAccount extends Account {
	
// double interestRate =5.58;
	
	public CurrentAccount(double balance) {
		
		super(balance);
	}
	
	@Override
	void calculateInterest() {
		//double interest = (balance*interestRate)/100;
	//	balance += interest;
		System.out.println("No Interest for Current Account");
	}

}
