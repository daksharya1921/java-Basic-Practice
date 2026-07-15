package com.polymorphism.classnotes.notificationsystem;

public class SMSNotification extends Notification {
	
	@Override
	void send() {
		System.out.println("notification :-> Hello By SMS");
	}

}
