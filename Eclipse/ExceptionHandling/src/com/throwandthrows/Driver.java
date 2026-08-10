package com.throwandthrows;

public class Driver {
	
	void method1() throws NullPointerException
	{
		throw new NullPointerException("This is Exception by throw in methods its throws ");
	}
	
	
	public static void main(String[] args) {
		Driver d = new Driver();
		try {
		d.method1();
		}
		catch(NullPointerException p) {
			System.out.println(p.getMessage());
		}
	}

}
