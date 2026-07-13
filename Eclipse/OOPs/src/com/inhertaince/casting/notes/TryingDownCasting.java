package com.inhertaince.casting.notes;

class Vehicle{
	
}

class Car extends Vehicle{
	
}

class Bike extends Vehicle{
	
}




public class TryingDownCasting {

	public static void main(String[] args) {
		
		Vehicle v = new Car(); // -> Upcasting
		
		Car c = (Car) v;
		
//		Bike b = (Bike) v; --> runtime error

	}

}
