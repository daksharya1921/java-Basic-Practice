package com.practice.de;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.practice.Bank;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream oic = new ObjectInputStream(new FileInputStream("bank.ser"));
		Object obj = oic.readObject();
		Bank b = (Bank) obj;
		System.out.println(b.getName()+" "+b.getPanNumber()+" "+b.getAadharNumber()+" "+b.getBalance());
		oic.close();
	}

}
