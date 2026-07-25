package com.test.week7;

public class Animal {

}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}

class Demo1{
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		Cat cat = /*(Cat)*/ animal;
	}
}