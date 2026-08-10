package com.notes;

public class Parent {
	
	void method() throws Exception {
		throw new Exception("Exception ");
	}

}

class Child extends Parent 
{
	@Override
	void method() throws RuntimeException 
	{
		throw new RuntimeException("RuntimeException ");
	}
}

class Driver {
	public static void main(String[] args) {
		Child child = new Child();
		try {
			child.method();
			
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}