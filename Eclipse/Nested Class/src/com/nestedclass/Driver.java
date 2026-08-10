package com.nestedclass;

public class Driver {

	public static void main(String[] args) {
//		OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
//		nestedObj.print();
		
		OuterClass2 privateStaticObj = new OuterClass2();
		privateStaticObj.display();
	}
}
