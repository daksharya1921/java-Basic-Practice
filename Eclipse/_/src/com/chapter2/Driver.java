package com.chapter2;

public class Driver {
	public static boolean valueOf(boolean b) {
		return b ? Boolean.TRUE : Boolean.FALSE;
	}
	public static void main(String[] args) {
		boolean b = Driver.valueOf(true);
		System.out.println(b);
	}
}
