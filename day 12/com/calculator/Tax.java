package com.calculator;

class Tax{
	
	static int tax = 12;
	static double  calculateTax(double salary){
		
		double amountTax= (salary/100.0*12.0);
		
		return amountTax;
	}
	
}