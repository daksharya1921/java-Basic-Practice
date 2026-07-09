package com.oops.encapsulation;

public class MainApp {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount(5000);
		System.out.println("ba.getBalance(): "+ba.getBalance());
		
		ba.setWithdrawl(275);
		System.out.println("ba.getBalance() After ba.setWithdrawl(275) : "+ba.getBalance());
		
		ba.setDeposit(510);
		System.out.println("ba.getBalance() After ba.setDeposit(510): "+ba.getBalance());

	}

}
