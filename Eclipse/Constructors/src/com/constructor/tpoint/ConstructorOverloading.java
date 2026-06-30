package com.constructor.tpoint;


//Java program to overload constructors    
class StudentOverloading{    
  int id;    
  String name;    
  int age;    
  //creating two arg constructor    
  StudentOverloading(int i,String n){    
  id = i;    
  name = n;    
  }    
  //creating three arg constructor    
  StudentOverloading(int i,String n,int a){    
  id = i;    
  name = n;    
  age=a;    
  }    
  //creating method to display values  
  void display(){System.out.println(id+" "+name+" "+age);}    
}  
//creating a Main class to create instance and call methods  
public class ConstructorOverloading{  
  public static void main(String args[]){    
  StudentOverloading s1 = new StudentOverloading(111,"Karan");    
  StudentOverloading s2 = new StudentOverloading(222,"Aryan",25);    
  s1.display();    
  s2.display();    
 }    
}    


