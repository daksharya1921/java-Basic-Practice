package com.sbibank.atm;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		atm.deposit(111, "4563");
		
		atm.setWithdrawl(100, "4563");
		
		
		

		    
//		        List<byte[]> memoryHog = new ArrayList<>();   ///  Allocated: 1 MB
//		Allocated: 2 MB
//		Allocated: 3 MB
//		Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//			at com.sbibank.atm.UserApp.main(UserApp.java:21)
//		        while (true) {
//		            memoryHog.add(new byte[1024 * 1024]); // allocate 1 MB chunks
//		            System.out.println("Allocated: " + memoryHog.size() + " MB");
//		        }
		    }
		
	}


