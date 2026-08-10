package com.test.week8;


// if final has an instance variable its will create every object one final variable
// -> final static  int p = 10; is an for only one copy in class and its constant for class
// final int p; is object specific

public class Parent {

	// final static  int p = 10;
	public void print(Object obj) {
		System.out.println("Parent");
	}

}

class Child extends Parent
{
	
	public void print(String string) {
		System.out.println("Child");
	}
}

class Main{
	public static void main(String[] args) {
		Parent p = new Child();
		p.print("Java");
		
	}
}