/*? Question 2: EMI Calculator

Create a package com.loan.emi.

Create class LoanApp.
Read loan amount from command line.
Create class EMI.
EMI should calculate monthly EMI as 8% of loan amount.
Print EMI. */

package com.loan.emi;

class LoanApp{

	public static void main(String[] args){
		
		double loan = Double.parseDouble(args[0]);
		
		System.out.println("Emi monthly::"+EMI.emiCalacutor(loan));
	}
}