package com.fuctionalinterface;






public class MainApp {

	public static void main(String[] args) {
		IDiscount d = (amountMoney,discountMoney) -> (amountMoney - (amountMoney*discountMoney/100));
		
		int result = d.apply(2000, 6);
		System.out.println(result);
	
	}
}
