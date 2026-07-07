package com.string.bufferbuilderexample;

public class StringBufferExample2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello ");
		
		sb.append("Duniya ");
		System.out.println(sb);
		
		System.out.println("-----------------------------------------");
		sb.append("\nNamste From The DAKSH ARYA");
		System.out.println(sb);
		System.out.println("-----------------------------------------");
		
		sb.insert(12, " ++++ ");
		System.out.println(sb);
		System.out.println("-----------------------------------------");
		
		int length = sb.length();
		System.out.println("sb. Length:"+length);
		
		System.out.println("New Capacity = (Current CApacity*2)+2 ------------------ > default value is 16");
		int capcity = sb.capacity();
		System.out.println("Capcity: "+capcity);
		

	}

}
