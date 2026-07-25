package com.revisie;

public interface IPrint {

	void printDetails();
	
	public default void justWalk() {
		System.out.println("IPrint.justWalk()");
	}
}

abstract class Print implements IPrint{
	
	abstract void pPrint();
	
	public void doPrint() {
		System.out.println("print.doPrint()");
	}
	
}


class JustPrint extends Print {

	@Override
	public void printDetails() {
		System.out.println("Print.JustPrint.printDetails()");
		
	}

	@Override
	void pPrint() {
		System.out.println("Print.JustPrint.pPrint()");
		
	}
	
	public static void main(String[] args) {
		
		JustPrint print=new JustPrint();
		
		
		print.justWalk();
		print.printDetails();
	
	}
	
}

