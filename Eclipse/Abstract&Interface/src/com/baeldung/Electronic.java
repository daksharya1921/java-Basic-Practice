package com.baeldung;

public interface Electronic {

	String LED = "LED";
	
	int getElectricityUse();
	
	static void doSomething() {
		System.out.println("Print Something ");
	}
	
	default void notSomething() {
		System.out.println("Not Something Printing");
	}
	
	
}

