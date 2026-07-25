package com.interfacedefault;

public class SBIBank implements IBankingSystem {

	@Override
	public void createAccount() {
		System.out.println("SBIBank.createAccount()");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("SBIBank.closeAccount()");
		
	}

//	@Override
//	public void printPassbook() {
//		// TODO Auto-generated method stub
//		
//	}

}
