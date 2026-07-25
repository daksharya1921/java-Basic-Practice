package com.interfacenotes;

public class Driver {
	
	public static void main(String[] args) {
		IBankAccount bank;
		bank = new SavingAccount(1000);
		bank.deposit(20);
		bank.withdraw(100);
		System.out.println("Balance "+bank.checkBalance());
		
		System.out.println();
		bank = new CurrentAccount(1000);
		bank.deposit(20);
		bank.withdraw(100);
		System.out.println("Balance "+bank.checkBalance());
	}

}
