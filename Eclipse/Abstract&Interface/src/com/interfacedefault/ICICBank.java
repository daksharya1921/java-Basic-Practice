package com.interfacedefault;

public class ICICBank implements IBankingSystem {

	@Override
	public void createAccount() {
		System.out.println("ICICBank.createAccount()");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("ICICBank.closeAccount()");
		
	}

//	@Override
//	public void printPassbook() {
//		// TODO Auto-generated method stub
//		
//	}

}
