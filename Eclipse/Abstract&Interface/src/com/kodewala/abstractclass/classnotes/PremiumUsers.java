package com.kodewala.abstractclass.classnotes;

public class PremiumUsers extends OrderManagement {

	public PremiumUsers(int orderPrice, String productName, String productId) {
		super(orderPrice, productName, productId);
	}
	
	@Override
	public void placeOrder() {
		System.out.println("PremiumUsers.placeOrder()");
		
	}

	@Override
	public void editOrder() {
		System.out.println("PremiumUsers.editOrder()");
		
	}

	@Override
	public void confirmOrder() {
		System.out.println("PremiumUsers.confirmOrder()");
		
	}
	
	public void userType() {
		System.out.println("PremiumUsers.userType()");
	}

}
