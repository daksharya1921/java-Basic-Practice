package com.string.bufferbuilderexample;

public class StringBufferExample {

	public static void main(String[] args) {
		
		
		//StringBuffer -> Thread Safe, Single thread , Slow 
		StringBuffer sBf = new StringBuffer();
		sBf.append("Hello Arya"); 
		System.out.println(sBf);
		
		sBf.insert(5, " Daksh ");
		System.out.println(sBf);
		
		sBf.delete(0, 6);
		System.out.println(sBf);
		

	}

}
