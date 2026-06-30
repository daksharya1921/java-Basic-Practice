package com.constructors.initializationblock;

class P {    
    P() {    
        System.out.println("parent class constructor invoked");    
    }    
}    
  
public class B3 extends P {    
    B3() {    
		super(); /* 1st line 
					 * A() { System.out.println("parent class constructor invoked"); }
					 */
		/*
		 * 2nd line { System.out.println("instance initializer block is invoked"); }
		 * 
		 */
        System.out.println("child class constructor invoked");    
    }    
  
    B3(int a) {    
		super();/*
				 * 1st line A() { System.out.println("parent class constructor invoked"); }
				 */
		/*
		 * 2nd line { System.out.println("instance initializer block is invoked"); }
		 * 
		 */
        System.out.println("child class constructor invoked " + a);    
    }    
  
    {    
        System.out.println("instance initializer block is invoked");    
    }    
  
    public static void main(String args[]) {    
        B3 b1 = new B3();    
        B3 b2 = new B3(10);    
    }    
}  