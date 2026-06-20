/*Question 1: Tax Calculator

Create a package com.tax.calculator.

Create a class TaxApp with the main() method.
Read salary from the command line.
Create another class Tax.
Tax should contain a static method calculateTax().
Tax = 12% of salary.
Print the calculated tax. */

package com.calculator;

class TaxApp{

	
	public static void main(String[] args){
		
		double salary = Double.parseDouble(args[0]);
		
		System.out.println("Calculated Tax::"+Tax.calculateTax(salary));
		
	}
}