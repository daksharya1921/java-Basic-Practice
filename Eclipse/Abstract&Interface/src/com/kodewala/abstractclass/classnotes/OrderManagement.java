package com.kodewala.abstractclass.classnotes;

public abstract class OrderManagement {
	
	int orderPrice;
	String productName,productId;
	
	public OrderManagement(int orderPrice,
	String productName, String productId) {
		this.orderPrice = orderPrice;
		this.productId = productId;
		this.productName = productName;
	}
	
	public abstract void placeOrder();
	
	public abstract void editOrder();
	
	public abstract void confirmOrder();
	
	public void displayOrderDetails() {
		
		System.out.println("Order Price:"+orderPrice);
		System.out.println("Product Name:"+productName);
		System.out.println("Product ID:"+productId);
		
	}
	
	
	
	

}
