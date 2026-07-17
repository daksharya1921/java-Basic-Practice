package com.abstraction.notes.bank;

public class BankSystem {

	public static void main(String[] args) {
		Account account;
		
//		account = new SavingAccount(1000);
//		account.calculateInterest();
		
		account = new CurrentAccount(100000);
		account.calculateInterest();
		
	}
}
