package com.fuctionalinterface;

@FunctionalInterface
public interface IDiscount{
	
	int apply(int amount, int discount);
}

@FunctionalInterface
interface IAmountDisount extends IDiscount{
	
	//int doSomething(int a , int b);
	//-> its will break the Functional Interface cuz its already had one abstract method inherited
	// but we can override same method
	//int apply(int amount, int discount);
	// this is not marker interface
	// this is functional interface
}
