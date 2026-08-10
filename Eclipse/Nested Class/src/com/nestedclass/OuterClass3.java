package com.nestedclass;

public class OuterClass3 {
	
	int instanceVariable = 10;
	static int classVariable = 20;
	
	// Its can be private / package - private(default)/ protected/ public
	class InnerClass{
		void print() {
			System.out.println(instanceVariable+classVariable); 
		}
	}

}
