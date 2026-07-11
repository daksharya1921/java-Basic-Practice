package com.inheritance.revision;

public class User extends UserMgmt {
	
	public void printInvoice(String orderId, String name) {
	
		System.out.println("Oder Id :"+orderId);
		System.out.println("Name: "+name);
	}

}
