package com.constructors.initializationblock;

class A {    
    A() {    
        System.out.println("parent class constructor invoked");    
    }    
}    
  
public class B2 extends A {    
    B2() {    
        super();   // its will go to class A cuz B2 extends A then Super() directly goes to A() constructor then excute the code then its will excute the A constructor then 
        // in this line will comes Instance Initializer Block
        System.out.println("child class constructor invoked");    
    }    
  
    {    
        System.out.println("instance initializer block is invoked");    
    }    
  
    public static void main(String args[]) {    
        B2 b = new B2();    
    }    
}  
