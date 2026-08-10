package com.bank;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Account account = new Account("daksh123", "Daksh Arya", "Test@123", "SBI0123", 15000);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.ser"));
		oos.writeObject(account);
		
		System.out.println("Serlization done...");
		oos.close();
	}
}
