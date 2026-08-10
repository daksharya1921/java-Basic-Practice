package com.bank.deser;
import com.bank.Account;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.bank.Account;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.ser"));
		Object obj = ois.readObject();
		Account account = (Account) obj;
		System.out.println(account.getName());
		System.out.println(account.getPassword());
		System.out.println(account.getUserId());
		System.out.println(account.getIfscCode());
		System.out.println(account.getBalance());
		
		System.out.println();
		System.out.println("Clone...................");

		Account a2;
		a2 = (Account) account.clone();
		
		System.out.println(a2.getName());
		System.out.println(a2.getPassword());
		System.out.println(a2.getUserId());
		System.out.println(a2.getIfscCode());
		System.out.println(a2.getBalance());
	}
}
