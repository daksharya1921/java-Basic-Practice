package com.aggregation.hasa.tpoint.example.maths;

public class Circle {

	Operation op;
	
	final double PI = 3.14;
	
	double area(int radius) {
		op = new Operation();
		int rSquare = op.square(radius);
		return PI*rSquare;
	}
}
