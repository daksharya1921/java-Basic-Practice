package com.constructor.tpoint;

 
//Let us see another example of default constructor    
//which displays the default values    
class StudentApp{    
  int id;    
  String name;    
  //method to display the value of id and name    
  void display(){System.out.println(id+" "+name);}    
}  
//Main class to create objects and calling methods  
public class MainApp{  
  public static void main(String args[]){    
      //creating objects    
      StudentApp s1=new StudentApp();    
      StudentApp s2=new StudentApp();    
      //displaying values of the object    
      s1.display();    
      s2.display();    
  }    
}    
