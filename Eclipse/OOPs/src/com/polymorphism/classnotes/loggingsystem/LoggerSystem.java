package com.polymorphism.classnotes.loggingsystem;

public class LoggerSystem {
	
	public static void main(String[] args) {
		Console console;
		
		console =new Console();
		console.log();
		
		console = new FileLogger();
		console.log();
		
		console = new DatabaseLogger();
		console.log();
	}

}
