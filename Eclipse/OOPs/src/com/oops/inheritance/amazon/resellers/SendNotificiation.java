package com.oops.inheritance.amazon.resellers;

import com.oops.inheritance.amazon.Notification;

public class SendNotificiation extends Notification {

	public String name = "gfhjkl";
	
	
	public static void main(String[] args) {
		SendNotificiation sn = new SendNotificiation();
		sn.sendNotifiction();
		System.out.println(sn.name);
	}
}
