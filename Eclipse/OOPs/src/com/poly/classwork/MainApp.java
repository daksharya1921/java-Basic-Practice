package com.poly.classwork;

public class MainApp {
	
	public static void main(String[] args) {
		Notification n1 = new EmailNotification();
		n1.sendNotification(); // Sending email notification - decided at runtime
		
		Notification n2 = new SMSNotification();
		n2.sendNotification();  // Sending email notification - decided at runtime
		
	}

}
