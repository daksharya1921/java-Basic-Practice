package com.kodewala.notes;

public class SavingAccount extends Account {
	
	double interestRate;
	public SavingAccount(double _balance, double _interestRate) {
		super(_balance);
		this.interestRate = _interestRate;
	}
	
	public void calculateInterest() {
		double interest = (balance*interestRate/100);
		System.out.println("Interest Earned: "+interest);
	}
	
	

}
