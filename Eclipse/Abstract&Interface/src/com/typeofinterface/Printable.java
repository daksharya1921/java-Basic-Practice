package com.typeofinterface;

public interface Printable {

}

class FileReader{
	
	
}
 class Main{
	 
	 public static void main(String[] args) {
		FileReader fileReader = new FileReader();
	
		if(fileReader instanceof Printable) {
			System.out.println("Its Implementing Printable Marker Interface");
		}
		else {
			System.out.println("Its will NOT Implementing Printable Marker Interface");
		}
	}
 }