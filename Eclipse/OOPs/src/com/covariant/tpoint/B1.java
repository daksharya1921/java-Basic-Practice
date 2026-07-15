package com.covariant.tpoint;

class A5 {  
    Object print() {      
      System.out.println("print method of class A");  
      return new Object();  
    }   
 }   


public class B1 extends A5 {
	
	@Override
	Integer print() {  
	      System.out.println("print method of class B");  
	      return new Integer(2);  
	    }      
	    
	      
	
	public static void main(String[] args) {
		
//		B1 b = new B1();    
//	      b.print();
//	      
//	      A5 a = new B1(); 
//	      
//	      a.print();  
		
		A5 a5 = new B1();
		B1 b1 =  (B1) a5;
		b1.print();
	}

}
