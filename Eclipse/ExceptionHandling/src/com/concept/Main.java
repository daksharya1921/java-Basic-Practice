package com.concept;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static void method1() {
		try {
		throw new ClassNotFoundException();
		}
		catch(ClassNotFoundException exceptionObject) {
			exceptionObject.printStackTrace();
		}
	}
}
