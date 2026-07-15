package com.overriding.tpoint.bank;

public class MainApp {
	
	public static void main(String[] args) {
		
		Bank sbi = new SBI();
		System.out.println("SBI Rate of Interest: "+sbi.getInterest());
		
		
		Bank axis = new AXIS();
		System.out.println("AXIS Rate of Interest: "+axis.getInterest());
		
		
		Bank icic = new ICIC();
		System.out.println("ICIC Rate of Interest: "+icic.getInterest());
		
		
		Bank bank = new Bank();
		System.out.println("Bank Rate of Interest: "+bank.getInterest());
	}

}
