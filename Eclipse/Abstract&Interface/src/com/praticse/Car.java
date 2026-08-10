package com.praticse;

public abstract class Car {
	
	abstract void startCar();
	
	abstract void stopCar();
	
	void greet() {
		System.out.println("Hello Heart!!");
	}
 
}

abstract class AmirCar extends Car{
	
	abstract void  electrnoicCar();
	
}

class Driver extends AmirCar{
	
	void startCar() {
		System.out.println("Press The Button");
	}
	
	void stopCar() {
		System.out.println("press the Break ");
	}
	
	
	public static void main(String[] args) {
		
		Object car = new Driver();
		System.out.println(car.getClass());
		
		
	}

	@Override
	void electrnoicCar() {
		System.out.println("Amirrrrrr");
		
	}
}
