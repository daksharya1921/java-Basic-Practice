package com.nestedclass;

public class OuterClass2 {
	
	int instanceVariable = 10;
	static int classVariable = 20;
	
	private static class NestedClass{
		// Its object cannot we created outside the class
		public void print() {
			
				System.out.println(classVariable);
			
		}
		
		
	}
	
//	public static void main(String[] args) {
//		NestedClass nestedClass = new NestedClass();
//		nestedClass.print();
//	}
	
	public void display() {
		NestedClass nestedClass = new  NestedClass();
		nestedClass.print();
	}

}
