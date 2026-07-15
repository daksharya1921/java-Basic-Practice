package com.overloading.tpoint;

public class Adder {
	
	
	// *************************************Very IMPORTANT**************************************************
	//-> method signature, which includes the method name and parameter list 
	
//	static int add(int a, int b) {
//		return a + b;
//	}

//	static double add(int e, int f) {
//		return a+b;
//	}

	// ->> this is also not method overloading cuz its only changing the return type
	// and changing only parameter(not size of parmeters like first was 2 now its THree)
	//  variable names is this is NOT A VALID OVERLOADING
	
//	static void add(int a, int b) {
//		System.out.println( a + b);
//	}//THis is also not valid parameters
	
	
	// *************************************Very IMPORTANT**************************************************
	//  two methods have the same name and parameter list but different return types, the compiler cannot determine which method to call based solely on the return type.
	
	
	// ------------------THis is valid OVERLOADING -> here parmeters type is different and return type is Different
	//-- like First was (int a , int b) but now its (double a, double b) and return type was first int and now its double
	  static double add(double a, double b) {    
	        return a + b;    
	    } 
	
	  
	  //-- this also  valid cuz its parmeters is in int and las
	  static double add(int a, int b) {    
	        return a + b;    
	    }
	  
	
	// ------------------THis is valid OVERLOADING
	static double add(int a, int b, int c) {
		return a + b+c;
	}

}
