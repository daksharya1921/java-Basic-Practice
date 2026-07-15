package com.overriding.tpoint;

class Vehicle{
	
	void start() {
		System.out.println("Vehicle is starting");
	}
	
	void run() {
		System.out.println("Vehicle is running");
	}
	
	
	
}



 class Bike extends Vehicle {
	 //its override the Vehicle class method i.e start() method
	 
	 void start() {
		 System.out.println("Bike is starting");
	 }
 }
