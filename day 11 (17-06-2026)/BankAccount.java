//package com.kodewala;

class BankAccount{
	
	public static double depositAmount(double balance){
		double updated = (balance+10.0);
		return updated;
		
	}
	//private double balance = 100;
	
	
	
	protected static double getBalance(double balance){
		return balance;
	}
	static void resetAccount(){
		System.out.println("Hello Reset account");
	}
	
	public static void main(String[] args){
		double balance = 100;
		//getBalance(balance);
		//resetAccount();
		//depositAmount(balance);
		Main.print();
	}
}

class Main{
	
	static void print(){
		BankAccount.depositAmount(1000);
		
		System.out.println("Get Balance::"+BankAccount.getBalance(100));
		
		BankAccount.resetAccount();
	}
	
}

