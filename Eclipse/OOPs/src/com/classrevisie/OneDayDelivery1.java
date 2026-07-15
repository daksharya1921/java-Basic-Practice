package com.classrevisie;

public class OneDayDelivery1 extends Delivery1{
	
	
	
	@Override
	public FlyPost estimateTime(String source, String destination) {
		
		System.out.println("OneDayDelivery1: standard estimate");
		
		return new FlyPost();
				
				
	}
	
	
	
}