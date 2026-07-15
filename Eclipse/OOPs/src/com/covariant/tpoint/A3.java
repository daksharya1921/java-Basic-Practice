package com.covariant.tpoint;

class A1{
	
	A1 foo() {
		
		return this;
	}
	void print() {
		System.out.println("THis is inside the Class A1");
	}
	
	
	
}


class A2 extends A1{
	@Override
	A1 foo() {
		return this;
	}
	@Override
	void print() {
		System.out.println("THis is inside the Class A2");
	}
}


class A3  extends A2{
	
	 @Override    
	    A1 foo()    
	    {    
	        return this;    
	    }    
	    @Override    
	    void print()    
	    {    
	        System.out.println("Inside the class A3");    
	    }    
	  

}


