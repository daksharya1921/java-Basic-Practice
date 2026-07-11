package com.inheritance.revision;

public class UserMgmt {
	
	final static private  String MSG1 = "Hello";
	final static private String MSG2 = "\nYour order is goes for delivery.";
	
	
	void notification(String name) {
		
		StringBuffer q = new StringBuffer();
		q.append(MSG1).append(name).append(MSG2);
		System.out.println(q);
	}

}
