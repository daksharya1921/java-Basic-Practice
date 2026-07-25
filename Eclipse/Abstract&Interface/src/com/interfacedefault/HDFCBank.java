package com.interfacedefault;

public class HDFCBank implements IBankingSystem {

	@Override
	public void createAccount() {
		System.out.println("HDFCBank.createAccount()");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("HDFCBank.closeAccount()");
		
	}

//	@Override
//	public void printPassbook() {
//		// TODO Auto-generated method stub
//		
//	}

}
