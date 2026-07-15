package com.overloading.tpoint;

public class MethodOverloadingwithTypePromotion {

	void sum(int a,long b){System.out.println(a+b);}    
	  void sum(int a,int b,int c){System.out.println(a+b+c);}    
}


class OverloadingCalculation3{  // One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.
	  void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	}  

class Main1{
	
	public static void main(String[] args) {
		MethodOverloadingwithTypePromotion motp = new MethodOverloadingwithTypePromotion();
		motp.sum(5, 7); // the output of this is always in long cuz we didn't instilze its so the int
						// would convert into long
		
		motp.sum(8,7, 90);  // this output or result will in int cuz all are in int
		
		//---------------------------------------------------------------
		
//		 OverloadingCalculation3 obj=new OverloadingCalculation3();  
//		  obj.sum(20,20);//now ambiguity  
	}
}