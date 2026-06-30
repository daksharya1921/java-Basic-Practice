package com.constructor.tpoint;

//public class  //Java program to initialize the values from one object to another object.    
class Student2{    
    int id;    
    String name;    
    //constructor to initialize integer and string    
    Student2(int i,String n){    
    id = i;    
    name = n;    
    }    
    //constructor to initialize another object    
    Student2(Student2 s){    
    id = s.id;    
    name =s.name;    
    }    
    void display(){System.out.println(id+" "+name);}    
}  
public class CopyConstructor{  
    public static void main(String args[]){    
    Student2 s1 = new Student2(111,"Karan");    
    Student2 s2 = new Student2(s1);    
    s1.display();    
    s2.display();    
   }    
}    