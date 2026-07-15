package com.reiviseclass;

class Delivery{
	Post printThis() {
		System.out.println("Delivery.printThis()");
		return new Post();
	}
	
}


class DHL extends Delivery{
	
	@Override
	SpeedPost printThis() {
		System.out.println("DHL.printThis()");
		
		return new SpeedPost();
	}
	
}

public class CovarientExample {

	public static void main(String[] args) {
		
		new DHL().printThis();

		
		
	}

}
