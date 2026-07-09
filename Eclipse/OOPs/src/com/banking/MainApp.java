package com.banking;

public class MainApp {

	public static void main(String[] args) {
		SavingAccount acc = new SavingAccount(500, "daiwik@123", 2.99);
		
		acc.showDetails();
		acc.interest();
	}
}
