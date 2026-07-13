package com.inhertaince.casting;

class  Parents{  
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Childs extends Parents {  
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  
	public	class UpcastingExample{  
	   public static void main(String args[]) {  
	        
	      Parents obj1 = (Parents) new Childs();  
	      Parents obj2 = (Parents) new Childs();   
	      obj1.PrintData();  
	      obj2.PrintData();  
	   }  
	}

 