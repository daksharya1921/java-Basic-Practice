package com.polymorphism.classnotes;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		Registration reg = new Registration();
		reg.doRegistration("1234-3456-5678");
		reg.doRegistration(2341, "+91-97132-98743");
		reg.doRegistration("+91-43793-52593", 5877);
		reg.doRegistration("Daiwik", "daiwik@kodewala");
		

	}

}
