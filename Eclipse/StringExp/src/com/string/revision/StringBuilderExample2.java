package com.string.revision;

import java.util.Scanner;

public class StringBuilderExample2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder message = new StringBuilder();
		
		System.out.println("Your NAme:");
		String name = s.nextLine();
		
		
		System.out.println(message.append(EmailNotification.MSG1).append(name).append(EmailNotification.MSG2));
		
		
		s.close();
	}

}
