package com.nestedclass;

public class OuterClass5 {
	
	int instanceVariable = 10;
	static int classVariable = 20;
	
	class InnerClass1{
		int innerClass1= 30;
	}
	class InnerClass2 extends InnerClass1{
		int innerClass2 = 40;
		
		public void print() {
			System.out.println(instanceVariable+classVariable+innerClass1+innerClass2);
		}
	}

}
