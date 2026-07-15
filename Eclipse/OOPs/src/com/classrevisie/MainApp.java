package com.classrevisie;









public class MainApp {
	
	public static void main(String[] args) {
		
		Delivery1 del1 = new ExpressDelivery1();
		
		  System.out.println(del1.estimateTime("Pakistan", "India").estimatePostTime("1", "2"));
		  
		
		  Delivery1 del2 = new OneDayDelivery1();
		  Post post = del2.estimateTime("Benalure", "Patna");
		  
		  
		  System.out.println();
		  System.out.println(post);
		  
		
	}
	
	

}
