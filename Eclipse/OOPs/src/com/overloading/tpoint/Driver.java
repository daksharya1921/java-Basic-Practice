package com.overloading.tpoint;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------");
		MathOpertions mo = new MathOpertions();
		
		System.out.println("mo.sumOfNumber(5, 1):"+mo.sumOfNumber(5, 1));
		
		System.out.println("mo.sumOfNumber(5, 1, 7):"+mo.sumOfNumber(5, 1, 7));
		System.out.println("---------------------------------------------------");
		
		StringManpulation sm = new StringManpulation();
		System.out.println("sm.concatenates(\"ghj\", \"gfhjk\")"+sm.concatenates("ghj", "gfhjk"));
		System.out.println("sm.concatenates(\"wrt\", \"dsg1\", \"gsd\")"+sm.concatenates("wrt", "dsg1", "gsd"));
		
		System.out.println("---------------------------------------------------");
		Adder a = new Adder();
		System.out.println("a.add(8, 9): "+a.add(8, 9));
		System.out.println("a.add(8, 9, 6): "+a.add(8, 9,6));
		
		
	}

}
