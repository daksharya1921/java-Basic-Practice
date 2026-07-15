package com.classrevisie;

public class ExpressDelivery1 extends Delivery1{
	
	@Override
	public SpeedPost estimateTime(String source, String destination) {
		
		System.out.println("ExpressDelivery1: standard estimate");
		
		return new SpeedPost();
	}
	
}