package com.polymorphism.classnotes;





public class PolymorphismExample {
	
	public static void main(String[] args) {
		
	
	Person person1,person2;
	
	person1 = new Student();
	person1.showRole();
	
	person2 = new BoyFriend();
	person2.showRole();
	
	}

}
