package com.encapsulation.revision;

public class Driver {
	
	public static void main(String[] args) {
		Account acc = new Account();
//		acc.balance =13;
//		acc.userId = "dgfg"; 
		// ->>>> its typically says other class cannot direct access so we use getter and setter methods on its to set and set the value
		
		acc.setBalance(10000);
		acc.setUserId("61487");
		
		
		
		acc.showBalance();
	}

}
