package com.polymorphism.classnotes.notificationsystem;

public class EmailNotification extends Notification{
	
	@Override
	void send() {
		System.out.println("notification :-> Hello by Email");
	}

}
