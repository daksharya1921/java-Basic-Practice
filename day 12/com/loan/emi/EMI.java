package com.loan.emi;

class EMI{
	
	static int emiPercent = 8;
	static double emiCalacutor(double loan){
		
		return ((loan/100.0)*emiPercent);
	} 
}