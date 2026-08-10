package com.nestedclass;

public class OuterClass4 {
	
	int instanceVariable = 10;
	static int classVariable = 20;
	
	public void display() {
		int methodLocalVariable = 30;
		class LocalInnerClass{
			int localInnerVariable = 40;
			void print() {
				System.out.println(instanceVariable+classVariable+methodLocalVariable+localInnerVariable);
			}
			
		}
		// its should we insited on thats set of block like method/ loop or if statement
		//cuz its its will remove after set of that method excute or that set of loop excute or thats if statement
		LocalInnerClass localObj = new LocalInnerClass();
		localObj.print();
		
	}

}
