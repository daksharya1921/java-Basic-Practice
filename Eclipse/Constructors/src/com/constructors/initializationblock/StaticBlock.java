package com.constructors.initializationblock;

public class StaticBlock {
		
	static 
	{
		
		System.out.println("Hello !!!!!!!");
		  
			  System.out.println("static block is invoked");  
			 // System.exit(0);  //-> to end the program after printing "static block is invoked" to the console
			  
		
	}
	
//	 void syso() {
//		System.out.println("StaticBlock.syso()");
//
//	}
	public static void main(String[] args) {
//		System.out.println("12345678");
//		StaticBlock s = new StaticBlock();
//		s.syso();
	}
}
