package com.overriding.tpoint;

public class Driver {

	
	public static void main(String[] args) {
		Vehicle b = new Bike();
		b.run(); // this method is not present in child class its get inherited from Vehicle( parent)
		
		b.start(); // its will override in run time
		
		
	}
}
