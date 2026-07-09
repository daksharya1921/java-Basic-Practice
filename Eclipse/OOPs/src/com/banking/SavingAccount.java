package com.banking;

public class SavingAccount extends Account{
	
	public double interestRate;
	
	public SavingAccount(double _balance, String _userId,double interestRate) {
		super(_balance, _userId);
		this.interestRate = interestRate;
	}

	public void interest() {
		double interest = balance*interestRate/100;
		System.out.println("Interest :"+interest);
	}
}
