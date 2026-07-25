package com.kodewala.abstractclass.classnotes;

public class Driver1 {
	
	public static void main(String[] args) {
		RetailsUser ru = new RetailsUser(0, "Iphone", "6789");
		ru.confirmOrder();
		ru.displayOrderDetails();
		ru.editOrder();
		ru.confirmOrder();
		ru.placeOrder();
		
		System.out.println();
		System.out.println("*****************************************************");
		System.err.println();
		PremiumUsers ru1 = new PremiumUsers(0, "Samsung", "54635241");
		ru1.confirmOrder();
		ru1.displayOrderDetails();
		ru1.editOrder();
		ru1.confirmOrder();
		ru1.placeOrder();
		
		System.out.println();
		System.out.println("*****************************************************");
		System.err.println();
		Resellers ru2 = new Resellers(0, "HTC", "988778654653");
		ru2.confirmOrder();
		ru2.displayOrderDetails();
		ru2.editOrder();
		ru2.confirmOrder();
		ru2.placeOrder();
	}

}
