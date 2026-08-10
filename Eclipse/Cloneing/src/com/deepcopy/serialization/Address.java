package com.deepcopy.serialization;

import java.io.Serializable;

public class Address implements Serializable 
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String line1 ;
	private String line2;
	
	public Address(String _line1,String _line2) {
		this.line1 = _line1;
		this.line2 = _line2;
	}
	
	public String getLine1() {
		return line1;
	}
	
	public String getLine2() {
		return line2;
	}
	
	public void setLine1(String _line1) {
		this.line1 = _line1;
	}
	public void setLine2(String _line2) {
		this.line1 = _line2;
	}
}