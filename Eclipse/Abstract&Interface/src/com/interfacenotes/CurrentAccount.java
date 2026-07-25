package com.interfacenotes;

public class CurrentAccount implements IBankAccount {

	private double balance;
	
	public CurrentAccount(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " in Current Account. New Balance: " + balance);

		
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;

		System.out.println("Withdraw " + amount + " in Current Account. New Balance: " + balance);
	}

	@Override
	
	public double checkBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}
