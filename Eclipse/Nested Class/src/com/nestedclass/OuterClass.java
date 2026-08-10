package com.nestedclass;

public class OuterClass {

	int instanceVariable = 10;
	static int classVariable = 20;
	
	static class StaticNestedClass{
		public void print() {
			System.out.println(classVariable);
		}
	}
}
