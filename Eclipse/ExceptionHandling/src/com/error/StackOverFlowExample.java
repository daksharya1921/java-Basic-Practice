package com.error;

public class StackOverFlowExample {
	
	void method1() {
		method2();
	}
	void method2() {
		method1();
	}
	
	public static void main(String[] args) {
		StackOverFlowExample sofe = new StackOverFlowExample();
		sofe.method1();
	}
	StackOverflowError

}
