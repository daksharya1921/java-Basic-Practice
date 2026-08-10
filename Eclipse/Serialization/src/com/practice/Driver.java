package com.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Bank bank = new Bank("Daksh Arya", "USDOWE0223", "2345-2343-4543-2334",10000);
		
		ObjectOutputStream ooc = new ObjectOutputStream(new FileOutputStream("bank.ser"));
		ooc.writeObject(bank);
		
		System.out.println("Serlia done.......");
		ooc.close();
	}

}
