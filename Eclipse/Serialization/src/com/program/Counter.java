package com.program;

import java.io.Serializable;

public class Counter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private  int count;
	Counter(int _count){
		this.count = _count;
	}
	public int getCount() {
		return count;
	}
	

}
