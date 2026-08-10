package com.class3;

public class Ecom {
	
	void placeOrder(String itemName, int qty) throws OrderQtyNegtiveException,NullPointerException{
		if(qty<0 && itemName == null) {
			throw new OrderQtyNegtiveException("Please Provide Above Zero Quntity");
		}
		if(qty < 0) {
			throw new OrderQtyNegtiveException("Please Provide Above Zero Quntity");
		}
		if(itemName == null) {
			throw  new NullPointerException("Its Null ");
		}
		
	}
	
	public static void main(String[] args) {
		Ecom ecom = new Ecom();
		try {
			ecom.placeOrder(null, 0);
		} catch (OrderQtyNegtiveException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
