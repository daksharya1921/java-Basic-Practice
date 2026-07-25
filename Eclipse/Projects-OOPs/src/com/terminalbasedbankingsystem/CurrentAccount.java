package com.terminalbasedbankingsystem;

public class CurrentAccount extends Account {

	{System.out.println("***************Current Account******************");}
	
	public CurrentAccount(double balance) {
		super(balance);
	}
	
	public void noLimit() {
		System.out.println("No Limit in Withdrwawl");
	}
	
	
}
