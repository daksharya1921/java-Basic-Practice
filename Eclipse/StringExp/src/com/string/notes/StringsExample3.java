package com.string.notes;

public class StringsExample3 {

	public static void main(String[] args) {
		
		// String literals
		String s1 = "Daksh"; // SCP ->>>object no 1
		String s2 = "Daksh"; // no more object its just refer same ->>>object no 1

		String s3 = new String("Daksh"); // Heap one object created its will check in SCP which is already present so
											// its won't do in SCP ->>>object no 2
		String s4 = new String("Daksh"); // in Heap one more object will create its will check in SCP which its alredy
											// present on that so its won't do anything as usual ->>>object no 3

		System.out.println("s1 == s2 :" + (s1 == s2)); // true both in SCP
		System.out.println("s1 == s3 :" + (s1 == s3)); // false cuz s1 is on SCP where as s3 is refering in heap
		System.out.println("s3 == s4 :" + (s3 == s4)); // false cuz s3 is heap its object which is created has differnt
														// address other than s4 which will have different referen
														// address
		

	}

}
