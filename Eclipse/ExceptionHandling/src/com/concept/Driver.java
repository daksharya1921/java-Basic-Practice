package com.concept;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.method1();
	}
	
	private void method1() {
		System.out.println("method1");
		method2();
	}
	private void method2() {
		System.out.println("method2");
		method3();
	}
	private void method3() {
		System.out.println("method3");
		int number = 5/0;
	}
}
