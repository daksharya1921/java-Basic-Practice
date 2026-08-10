package com.nestedclass;

public class Test {

	public static void main(String[] args) {
		Car bmw = new Car() {
			
			@Override
			public void startCar() {
				System.out.println("BMW Start");
			}
		};
		
		bmw.startCar();
	}
}
