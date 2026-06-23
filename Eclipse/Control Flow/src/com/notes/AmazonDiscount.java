package com.notes;

public class AmazonDiscount {

	private static void isDiscount(double orderAmount) {
		
		if(orderAmount >= 10000) {
			System.out.println("Discount applied: 20%");
		}
		else if(orderAmount >= 5000) {
			System.out.println("Discount applied: 15%");
		}
		else if(orderAmount >= 2000) {
			System.out.println("Discount applied: 10%");
		}
		else {
			System.out.println("No Discount available");
		}
		
	}
	
	public static void main(String[] args) {
		
		int amount = 10000;
		
		isDiscount(amount);

	}

}
