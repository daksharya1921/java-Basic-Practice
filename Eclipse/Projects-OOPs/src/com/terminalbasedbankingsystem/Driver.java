package com.terminalbasedbankingsystem;

public class Driver {

	public static void main(String[] args) {
		Account account;
		// = new Account(0);
//		account.deposit(-100);
//		account.withdraw(1000);
//		System.out.println("Balance: "+account.showBalance());
		
		account = new SavingAccount(100);
		SavingAccount saving = (SavingAccount) account;
		System.out.println("After interest Rate::"+saving.interestRate());
		
		account = new CurrentAccount(100);
		CurrentAccount current = (CurrentAccount) account;
		current.noLimit();
	}
}
