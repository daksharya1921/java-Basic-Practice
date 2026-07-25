package com.interfacedefault;

public class BGBank implements IBankingSystem{

	@Override
	public void createAccount() {
		System.out.println("BGBank.createAccount()");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("BGBank.closeAccount()");
		
	}

	@Override
	public void printPassbook() {
		System.out.println("BGBank.printPassbook()");
		
	}

}
