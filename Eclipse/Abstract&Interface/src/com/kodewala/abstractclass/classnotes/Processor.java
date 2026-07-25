package com.kodewala.abstractclass.classnotes;

public class Processor {

	public void process(OrderManagement management) {
		management.placeOrder();
		management.displayOrderDetails();
		management.confirmOrder();
		management.editOrder();
	}
}
