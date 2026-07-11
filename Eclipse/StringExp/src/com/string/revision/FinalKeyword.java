package com.string.revision;

//final class Test{
//	
//}   ->> final class cannot we inherited like its will not have child 


class Something{
	
	final void doSomething() {
		
	}
	
}

public class FinalKeyword  extends Something{
	
//	int value = 10;
//	
//	void nothingDo() {
//		value = 11;
//	}
	
	// if value variable is final its won't change its becomes change and its naminng becomes capital letter
	
	
	final int VALUE = 10;

	void nothingDo() {
		// VALUE = 11; ->> its will through error ki its VALUE is final keyword its won't reassign 
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	void doSomething() {
//		
//	} ->> final method cannot we override its will through error 

	
	
	
}
