package com.concept;

public class StackOverFlowErrorExample {
 
	public static void main(String[] args) {
		StackOverFlowErrorExample sofe = new StackOverFlowErrorExample();
		sofe.method1();
	}
	
	private void method1() {
		method2();
	}
	private void method2() {
		method1();
	}
}
