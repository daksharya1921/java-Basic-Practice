package com.reiviseclass;

class Customer{
	
	private void internalDetails() {
		System.out.println();
	}
	
	public final void loyaltyPoint() {
		System.out.println("Customer.loyaltyPoint()");
	}
	
	public void calculatePrice() {
		System.out.println("Customer.calculatePrice()");
	}
}


public class GoldCustomer extends Customer {

//	@Override
//	private void internalDetails() {   ->this is private can not we access or overriden cuz its not print in child class
//		System.out.println();
//	}
	
	@Override // -> valid override
	public void calculatePrice() {
		System.out.println("GoldCustomer.calculatePrice()");
	}
	
//	@Override   -> override final class is not possible cuz its buts is usuable
//	public  void loyaltyPoint() {
//		System.out.println("Customer.loyaltyPoint()");
//	}
	
	
	public static void main(String[] args) {
		GoldCustomer gc = new GoldCustomer();
		gc.loyaltyPoint(); // ->  cuz its final its can accessabile any where but once intilze it won't override
	}
	
	
}
