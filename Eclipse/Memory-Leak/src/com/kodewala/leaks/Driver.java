package com.kodewala.leaks;

public class Driver {
	
	public static void main(String[] args) 
	{
	
		Payment parent = new Payment();
		System.out.println(parent);
		// 
		
		parent = null; // -> here after use of parent set parent = null so can garbage collector will come and 
		// clean the heap space
		
		
		
		
	}

}
