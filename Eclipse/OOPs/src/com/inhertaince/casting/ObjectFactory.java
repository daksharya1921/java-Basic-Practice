package com.inhertaince.casting;

public class ObjectFactory {
	
	public static Object getObjects(String objectName) {
		Object obj = null;
		if(objectName.equalsIgnoreCase("Employee")) {
			obj = new Employee();
		}
		else if(objectName.equalsIgnoreCase("Manager")){
			obj = new Manager();
		}
		else {
			System.out.println("Invalid");
		}
		return obj;
	}

}
