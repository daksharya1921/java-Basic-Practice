package com.constructors.initializationblock;

public class  Bike8 {    
	int speed;

	Bike8() {
		// 1. line will alwasys be suoer() or this
		// 2. line wille be
		/*
		 * { System.out.println("instance initializer block invoked"); }
		 */
		
		// then after the constructor have other code 
		System.out.println("constructor is invoked");
	}

	{
		System.out.println("instance initializer block invoked");
	}

	public static void main(String args[]) {
		Bike8 b1 = new Bike8();
		Bike8 b2 = new Bike8();
	}    
}  


// The java compiler copies the code of instance initializer block in every constructor.

/*
 * Bike8() {
 * 
 * System.out.println("constructor is invoked"); } {
 * System.out.println("instance initializer block invoked"); }
 * 
 * 
 * 
 * 
 * Bike8() {
 *  // 1. line will alwasys be suoer() or this
 * 
 *  { System.out.println("instance initializer block invoked"); }
 * 
 * System.out.println("constructor is invoked"); }
 * 
 * 
 * complier will do like this 
 * 
 */