package com.oops.inheritance;

public class Driver {

	public static void main(String[] args) {
		
		Child c = new Child();
		 System.out.println("c.parentValue:"+c.parentValue);
		 System.out.println("c.parentName: "+c.parentName);
		 c.parentMethod();
		 
		 
		 System.out.println("c.childValue:"+c.childValue);
		 System.out.println("c.childName: "+c.childName);
		 c.childMethod();
		 
	}

}
