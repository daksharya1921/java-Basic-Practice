package com.listexample.arraylistexample.classcode2;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

public class Address implements Serializable
{
	
	private String line1;
	private String line2;
	
	public Address(String line1,String line2) 
	{
		this.line1 = line1;
		this.line2 = line2;
		
	}
	
	public String getLine1() {
		return line1;
	}
	public String getLine2() {
		return line1;
	}

	
	
	

}
