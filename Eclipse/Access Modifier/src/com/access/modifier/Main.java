package com.access.modifier;

public class Main {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		account.deposit(1000);
		
		System.out.println("Balance : "+account.getBalance());
		
	//	account.balance =5000;
	//	account.updateBalance(5000);

	}

}
