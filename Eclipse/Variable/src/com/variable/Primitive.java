package com.variable;

public class Primitive {

	public static void main(String[] args) {
		
		// float -> 32 bits . IEEE 754 value
		// double -> 64 bits . IEEE 754 value
		
		float var1 = .3f;
		float var2 = .1f;
		float var3 = var1- var2;
		
		System.out.println(var3);
		
		//we never use float and decimal in the industry 
		//insted use big decimal 
		// comany which deals with currency use BigDecimal
		
	//	boolean -> 1 bits default false
		
		
		
		
		//types of conversion 
		//1.> Widening/Automatic conversion
		//2.>Narrowing/Downcasting/Explict Conversion
		//3.>Promotion during expression
		//4.>Explict casting during Expression
		
		
		
		//1.> Widening/Automatic conversion
		
		int i = 10; 
		long p = i; // -->>widening happen whenever lower to higher byte-> short -> int -> long 
		
		
		// 2.>Narrowing/Downcasting/Explict Conversion
		int integerValue = 10;
		// byte byteValue = integerValue; this will throw error down casting
		// autoMaticaly doesn't work we have to manually downcast assigning like (byte)
		// for this
		
		
		// range of byte : -128 to 127
		byte byteValue = (byte) integerValue;
		
		
		//3.>Promotion during expression
		byte a = 127;
		byte b = 1;
		// byte sum = a+b; // during expression when we cross the range like for byte is 127 it do internal promotion  .byte,short -> promoted directly convert to int 
		int  sum = a+b;
		
		//if one of data type is higher everything converted to higher one 
		int c = 32;
		double doubleVar = 20d;
		
		// int sum = c+ doubleVar; 
		
		// types of variable 
		
		
	}

}
