package com.polymorphism.classnotes;

public class Registration {
	
	void doRegistration(String aadhar) {
		System.out.println("Registered using Aadhar:"+aadhar);
	}
	void doRegistration(String mobile,int otp) {
		System.out.println("Registered using Mobile: "+mobile+" with OTP: "+otp);
	}
	void doRegistration(String name,String email) {
		System.out.println("Registered using Name: "+name+" with Email: "+email);
	}
	void doRegistration(int otp,String mobile) {
		System.out.println("Registered using OTP: "+otp+" with Mobile: "+mobile);
	}

}
