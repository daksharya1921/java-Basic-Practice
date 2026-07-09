package com.gadgets;

public class Driver {

	
	public static void main(String[] args) {
		ElectronicProducts ep = new ElectronicProducts();
		
		System.out.println(ep.productPrice);
		
		ep.productInvoice();
	}
}
