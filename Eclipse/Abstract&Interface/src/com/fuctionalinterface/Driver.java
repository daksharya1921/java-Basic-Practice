package com.fuctionalinterface;

/*
 * Fuctional Interface is introduced in java 8 
 * its must  have only one Abstract method 
 * its can have as many as static , default and private method
 * to check its one annotation thats check  @FunctionalInterface
 * by help of Functional Interface we write lemda expression and we achieve fuctional Programming
 * for using fuctional Interface we dont need to implements 
 * we can call direct using functional interface
 * 
 */




public class Driver {
	
	public static void main(String[] args) {
		ICalc calc = (a,b) -> a+b;
		
		int result = calc.calculation(100, 8);
		
		System.out.println("Result: "+result);
		System.out.println();
		calc = (a,b) -> 
		{ 
			int sub = a-b;
			return sub;
		};
		
		result  =  calc.calculation(15, 8);
		System.out.println("Result: "+result);
		System.out.println();
		
		
		IConcat c = (input1, input2) -> {
			
			String s = input1+input2;
			return s;
		};
		
		String output = c.concat("Hello ", "World!!");
		System.out.println(output);
	}

}
