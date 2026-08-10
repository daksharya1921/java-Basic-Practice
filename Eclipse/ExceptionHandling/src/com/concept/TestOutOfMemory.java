package com.concept;

public class TestOutOfMemory {

	public static void main(String[] args) {
		String[] s = new String[900000000*900000000*900000000];
	}
}
