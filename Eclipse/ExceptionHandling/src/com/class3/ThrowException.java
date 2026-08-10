package com.class3;

import javax.swing.TransferHandler;

public class ThrowException {
	
	void method1() throws NoException
	{
		throw new NoException("Hello");
		
	}
	
	public static void main(String[] args) {
		
		ThrowException te = new ThrowException();
		try {
			te.method1();
		} catch (NoException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
