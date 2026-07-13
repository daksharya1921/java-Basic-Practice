package com.inhertaince.casting;

class Parentd {   
    String name;   
    
    // A method which prints the data of the parent class   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
// Child class   
class Childd extends Parentd {   
    int age;   
    
    // Performing overriding  
    @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}   
    
public class Downcasting{  
    
    public static void main(String[] args)   
    {   
        Parentd p = new Childd();  
        p.name = "Shubham";  
          
        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
        Childd c = (Childd)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
    }   
}  
