package com.abstraction.notes.banksystem;

public class BankPaymentProcesser {
	
	void processBankPayment(Bank bank) {
		int balance = bank.calculateInterest();
		System.out.println(balance);
		
	}

}
