package com.inhertaince.casting.notes;

class Product{
	public void displayProductDetails() {
		System.out.println("Generic product ..............");
	}
}

class ElectronicProduct extends Product{
	@Override
	public void displayProductDetails() {
		System.out.println("Electronic product ..............");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		ElectronicProduct ep = new ElectronicProduct();
		System.out.println("ElectronicProduct ep = new ElectronicProduct()::: ");
		ep.displayProductDetails();
		
		
		
		Product p = new ElectronicProduct(); // -> Upcasting
		System.out.println("p.displayProductDetails() -> Upcasting :::");
		p.displayProductDetails();
		ElectronicProduct ep1 =(ElectronicProduct)p;
		System.out.println("ep1.displayProductDetails() -> DownCasting: :::");
		ep1.displayProductDetails();

	}

}
