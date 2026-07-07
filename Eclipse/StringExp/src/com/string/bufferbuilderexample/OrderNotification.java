package com.string.bufferbuilderexample;

public class OrderNotification {
	
	
	
	public String sendNotification(String name, String jobRole, double fee) {
		
		//StringBuffer notifiction = new StringBuffer();
		StringBuilder notifiction = new StringBuilder();
		notifiction.append(EmailMessage.MSG1).append(name).append(EmailMessage.MSG2).append(jobRole).append(EmailMessage.MSG3).append(fee);
		
		//String output = notification.toString();
		return notifiction.toString();	
		
	}

}
