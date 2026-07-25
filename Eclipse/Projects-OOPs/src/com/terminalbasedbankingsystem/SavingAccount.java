package com.terminalbasedbankingsystem;

public class SavingAccount extends Account {

	
	public static final double INTEREST_RATE= 4.5;
	
	{System.out.println("***************Saving Account******************");}
	
	public SavingAccount(double balance) {
		super(balance);
		
	}
	
	public double interestRate() {
		
		double currentBalance = super.showBalance();
		double interest = (INTEREST_RATE*currentBalance)/100;
		//balance += interest;
		super.deposit(interest);
		return super.showBalance();
	}
	
	
	

}
