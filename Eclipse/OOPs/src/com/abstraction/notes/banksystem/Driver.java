package com.abstraction.notes.banksystem;



public class Driver {

	public static void main(String[] args) {
		Bank bank;
		
		bank = new SavingAccount(5,2500);
		bank = new CurrentAccount(2500);
		
		BankPaymentProcesser process = new BankPaymentProcesser();
		
		 process.processBankPayment(bank);
		 bank.displayBalance();
		
	}
}
