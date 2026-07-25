package com.interfacenotes;

public class SavingAccount implements IBankAccount {
	private double balance;

	public SavingAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " in Saving Account. New Balance: " + balance);

	}

	@Override
	public void withdraw(double amount) {

		if (balance - amount >= MIN_BALANCE) {

			balance -= amount;

			System.out.println("Withdraw " + amount + " in Saving Account. New Balance: " + balance);
		} else {
			System.out.println("Insufficent balance!!");
		}
	}

	@Override
	public double checkBalance() {
		
		return balance;
	}

}
