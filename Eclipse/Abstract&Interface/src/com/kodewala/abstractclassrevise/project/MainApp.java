package com.kodewala.abstractclassrevise.project;

public class MainApp {
	
	public static void main(String[] args) {
		ProcessorAnimalMethod process = new ProcessorAnimalMethod();
		process.process(new Dog());
		System.out.println();
		process.process(new Cat());
	}

}
