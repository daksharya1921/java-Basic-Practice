package com.polymorphism.classnotes.notificationsystem;

public class NotificationApp {
	
	public static void main(String[] args) {
		
		Notification notification;
		notification = new EmailNotification();
		
		notification.send();
		
		notification = new SMSNotification();
		notification.send();
		
		notification = new Notification();
		notification.send();
		
	}

}
