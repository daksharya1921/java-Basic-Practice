package com.abstraction.notes.bank;

public class SavingAccount extends Account{
	
	double interestRate =5.58;
	
	public SavingAccount(double balance) {
		
		super(balance);
	}
	
	@Override
	void calculateInterest() {
		double interest = (balance*interestRate)/100;
		balance += interest;
		System.out.println("Interest added: "+interest);
	}

}
