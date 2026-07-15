package com.classrevisie;


class Delivery{
	
	
	static void printDetails(){
		
		System.out.println("Delivery.printDetails()");
		
	}
	
	
}

class ExpressDelivery extends Delivery{
	
	
	// ***************************************************************ERROR********************************************************************
	/* Driver.java:16: error: printDetails() in ExpressDelivery cannot override printDetails() in Delivery
         void printDetails(){
              ^
  overridden method is static
1 error */
//	@Override
//	 void printDetails(){
//			System.out.println("ExpressDelivery.printDetails()");
//		}
	
	
	
}

public class Driver {

	
	public static void main(String[] args) {
		Delivery d = new ExpressDelivery();
		d.printDetails();
	}
}
