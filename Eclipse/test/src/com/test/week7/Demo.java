package com.test.week7;

class Parent{
	Parent(){
		display();
	}
	
	void display() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	int x =100;
	
	@Override
	void display() { 
		
		System.out.println(x+"");
	}
}


public class Demo {
	
	public static void main(String[] args) {
		new Child();
	}

}
