package com.reiviseclass;

public class ObjectAutomaticCreating {
	
	
	public static Object giveObject(String value) {
		
		Object obj = null;
		
		if(value.equalsIgnoreCase("Daksh")) {
			System.out.println("Helo Daksh Object Is Created");
			obj = new Daksh();
		}
		else {
			System.out.println("Please Provide the Object ");
		}
		
		
		return obj;
	}
	

}
