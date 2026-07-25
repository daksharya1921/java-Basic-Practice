package com.interfacedefault;

public interface IBankingSystem {

	
	int MAX_VALUE= 10;
	
	void createAccount();
	
	void closeAccount();
	
	//  now after 10 year after Banking systen wanna ki implements printPassbook only in Rural Bank  now only 
	// this we have to write here like in Interface before java 8 there was ki we have to implements in each and every class if we need or not need 
	// like 
	
	//void printPassbook();
	
	// in java 8 we had one feature added ki we will write default before method and if i wanna implements or override we can do that 
	// like
	// for above one
	public default void printPassbook() {
		System.out.println("IBankingSystem.printPassbook()");
	}
	
	
	// different between abstract class and interface after java 8 
	// basically we used default method for backward compdility
}
