package com.method.example;

public class Calculation {
	
	public int sum(int var1, int var2) {
		System.out.println("Sum to var1 "+var1+ " + "+" var2 "+var2);
		return var1+var2;
	}

	public int getPriceOfPen() {
		// TODO Auto-generated method stub

		int capPrice = 2;
		int penBodyPrice = 5;
		
		int totalPrice = sum(capPrice,penBodyPrice);
		return totalPrice;
	}

}
