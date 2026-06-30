package com.constructor.tpoint;

public class Demo {

//	 static Demo() {   // Compilation error  
//	    }  
//	 
	
	
	//We can use access modifiers while declaring a constructor. 
	//It controls the object creation. 
	//A constructor may be private, protected, public or default.
	
	 Demo() {  
	        System.out.println("Object created");  
	    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
	}

}
  