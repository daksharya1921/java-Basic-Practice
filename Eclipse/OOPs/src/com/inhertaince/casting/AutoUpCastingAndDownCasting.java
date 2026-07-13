package com.inhertaince.casting;


class Parent{
	void doSomething() {
		System.out.println("Parent.doSomething()");
	}
}


class Child extends Parent{
	@Override
	void doSomething() {
		System.out.println("Child.doSomething()");
	}
}


public class AutoUpCastingAndDownCasting {
	
	public static void main(String[] args) {
		
		//Parent p1 = new Child();  // -> auto upcasting -> i.e child can do upcasting to parents class
	//	Parent p2 = (Parent) new Child(); // -> same we do write upcasting thing -> (Parent)
	//	p2.doSomething();
		
		
		//Child c1 = new Parent(); // --> this is we are trying to do downCast which is not possible we need to downCast by Self
		Parent p2 = (Parent) new Child();
		Child c1 = (Child) p2;
		
	    c1.doSomething();
		
	}

}
