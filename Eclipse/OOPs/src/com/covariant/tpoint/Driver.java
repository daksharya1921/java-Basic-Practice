package com.covariant.tpoint;


class A{
	
	A get(){
		System.out.println("A.get()");
		
		return this;
	}
	
}

class B extends A{
	
	B get() {
		
		System.out.println("B.get()");
		
		return this;
	}
	
	void message(){System.out.println("Welcome to the covariant return type");}    
	public static void main(String[] args) {
		
//		new B().get();
		new A().get();
		new B().get().message();;
		
	}
}


public class Driver {

}
