package com.string.bufferbuilderexample;
import java.time.LocalDate;

public class Driver {

	public static void main(String[] args) {
//		OrderNotification send = new OrderNotification();
//		
//		
//		String print = send.sendNotification("Daksh","Backend Engineer", 657890);
//		System.out.println(print);
		
//		QuaryConstructor  qc= new QuaryConstructor();
//		String result = qc.printQuary("tcs_365789", 345678);
//		System.out.println(result);
		
		DyanmicSqlQuery dsQ = new DyanmicSqlQuery();
		
		LocalDate date = LocalDate.of(2026, 7, 8);
		String output = dsQ.queryGenerator("IT", 50000, date);
		
		System.out.println(output);
		
		
	}
	
	
	
}
