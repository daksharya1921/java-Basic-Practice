package com.interfacenotes;

public interface IBankAccount {

	public static final double MIN_BALANCE = 1000.0;
	
	void deposit(double amount);
	public void withdraw(double amount);
	public abstract double checkBalance();
	
	
	
}
