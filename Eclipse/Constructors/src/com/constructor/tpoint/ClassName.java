package com.constructor.tpoint;

//public class ClassName {
//	
//	  
////	    ClassName(dataType parameter1, dataType parameter2, ...) {  
////	        // constructor body  
////	    }  
//	  // parmetrized Constructor 
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}


//Java Program to demonstrate the use of the parameterized constructor.    
class Student1{    
  int id;    
  String name;    
  //creating a parameterized constructor    
  Student1(int i,String n){    
  id = i;    
  name = n;    
  }    
  //method to display the values    
  void display(){System.out.println(id+" "+name);}    
}  
//Main class to create objects and class methods  
public class ClassName{  
  public static void main(String args[]){    
  //creating objects and passing values    
  Student1 s1 = new Student1(111,"Joseph");    
  Student1 s2 = new Student1(222,"Sonoo");    
  //calling method to display the values of object    
  s1.display();    
  s2.display();    
 }    
}    