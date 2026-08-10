package com.deepcopy.serialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class DeepCopySerialization 
{
	

	public static void main(String[] args) throws IOException {
		
		Address address = new Address("Bihar Sharif", "Bihar");
		Person person1 = new Person("Daksh Arya", address);
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(person1); 
		
		System.out.println("Serialization Done");
		
 	}
	

}
