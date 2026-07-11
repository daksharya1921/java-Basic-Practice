package com.inheritance.tpoint;

class Animal{
		void eat() {
			System.out.println("Eatingggg...................");
		}
}

class Dog extends Animal{
	void bark() {
		System.out.println("barking.................");
	}
}

class BabyDog extends Dog{
	void weep() {
		System.out.println("Weeping................");
	}
}


class Cat extends Animal{
	void meow() {
		System.out.println("Meowing......................");
	}
}
public class MainApp {

	
	public static void main(String[] args) {
//		BabyDog d = new BabyDog();
//		d.eat();
//		d.bark();
//		d.weep();
		
		Cat c = new Cat();
		c.meow();
		c.eat();
		System.out.println("----------------------------------------------");
		
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
