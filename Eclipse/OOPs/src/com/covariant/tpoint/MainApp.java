package com.covariant.tpoint;

public class MainApp {
	
	public static void main(String[] args) {
//		System.out.println("----------------------------------------");
//		A1 a1 = new A1();
//		a1.foo().print();
//		System.out.println("----------------------------------------");
//		
//		A2 a2 = new A2();
//		((A2)a2.foo()).print(); // for better readility we follow 
//		
//		System.out.println("----------------------------------------");
//		A3 a3 = new A3();
//   	a3.foo().print();
//		((A3)a3.foo()).print(); // both are same there is no differece
//		System.out.println("----------------------------------------");
		
		
		
		
		A1 a1 = new A2(); // -> autoUpcast 
		//a1.foo().print();
		
		A2 a2d = (A2)a1; // -> downCast using upcast
		
		A2 a2u = new A3();
		
		
		A3 a3d = (A3)a2u; // -> downCast to downCast ->> its will error to down cast this first we need to upcast A2 then downcast its 
		
	}

}
