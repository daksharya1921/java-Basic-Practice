package com.kodewala.abstractclass.classnotes;

public class Resellers extends OrderManagement {

	public Resellers(int orderPrice, String productName, String productId) {
		super(orderPrice, productName, productId);
	}

	@Override
	public void placeOrder() {
		System.out.println("Resellers.placeOrder()");
		
	}

	@Override
	public void editOrder() {
		System.out.println("Resellers.editOrder()");
		
	}

	@Override
	public void confirmOrder() {
		System.out.println("Resellers.confirmOrder()");
		
	}
	
	public void userType() {
		System.out.println("Resellers.userType()");
	}
	
}
