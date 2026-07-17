package com.poly.classwork;

class Parent{
	
	void m1() {
		System.out.println("M1 shared logic");
	}
}

public class Child2 extends Parent{
	
	void m2() {
		System.out.println("Child 2 shared logic");
	}

}

 class Child3 extends Parent{
	
//	void m2() {
//		System.out.println("Child 2 shared logic");
//	}
	 
	 private Child2 c2 = new Child2();
	
	 public void usedSharedLogic() {
		 c2.m2();
	 }

}