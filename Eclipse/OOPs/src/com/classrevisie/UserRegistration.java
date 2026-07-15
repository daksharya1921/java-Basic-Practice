package com.classrevisie;

import com.inheritance.revision.User;

public class UserRegistration {
	
	public void doRegistration(String mobile, int otp) {
		
		System.out.println("Registered via mobile + otp");
	}
	
	public void doRegistration(String aadhaar) {
		System.out.println("Registered vai Aadhar");
	}
	
	public void doRegistration(int atmPin, String cardNumber) {
		System.out.println("Registered via ATM PIN + card");
	}
	
	public void doRegistration(String dln, String voterId) {
		System.out.println("egistered via DL + Voter ID");
	}

}


class Driver1{
	
	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();
		
		ur.doRegistration("1234-4567-7890");
		ur.doRegistration("9078653123", 1234);
		ur.doRegistration(1232, "1234-3456-5678-7890");
	}
}