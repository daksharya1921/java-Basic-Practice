package com.kodewala.notes;

public class Driver {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1000, 2.5);
		sa.calculateInterest();
		sa.showBalance();

	}

}
