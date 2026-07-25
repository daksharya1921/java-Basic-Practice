package com.kodewala.abstractclass.classnotes;

public class RetailsUser extends OrderManagement {
	
	public RetailsUser(int orderPrice, String productName, String productId) {
		super(orderPrice, productName, productId);
	}

	@Override
	public void placeOrder() {
		System.out.println("RetailsUser.placeOrder()");
		
	}

	@Override
	public void editOrder() {
		System.out.println("RetailsUser.editOrder()");
		
	}

	@Override
	public void confirmOrder() {
		System.out.println("RetailsUser.confirmOrder()");
		
	}
	
	public void userType() {
		System.out.println("RetailsUser.userType()");
	}
	
	

}
