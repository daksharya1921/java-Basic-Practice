package com.listexample.linkedlistexample;

import java.util.LinkedList;

public class BankSystem {
	
	public LinkedList<Bank> bankDetails(){
		
		LinkedList<Bank> bankDetials = new LinkedList<Bank>();
		
		bankDetials.add(new Bank("SBI","Daksh Arya","SBIO000212",1000));
		
		return bankDetials;
	}

}
