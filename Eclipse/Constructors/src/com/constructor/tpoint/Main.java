package com.constructor.tpoint;

//Java Program to create and call a default constructor    
class Bike{    
	
  //creating a default constructor    
  Bike(){System.out.println("Bike is created");}    
}  
public class Main{  
  //main method    
	
	//If there is no constructor in a class, compiler automatically creates a default constructor.
  public static void main(String args[]){    
      //calling a default constructor    
      Bike b=new Bike();    
  }    
}    