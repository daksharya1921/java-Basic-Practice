package com.kstrct;

public class LocalBus {

	String busNumber;
	String busRoute;
	int distanceCovered;
	int runTime;
	
	public LocalBus(String _busNumber, String _busRoute, int _distanceCovered, int _runTime) {
		
		this.busNumber = _busNumber;
		this.busRoute = _busRoute;
		this.distanceCovered = _distanceCovered;
		this.runTime = _runTime;
		
		
	}
	
	public static void main(String[] args) {
		
		LocalBus lB1 = new LocalBus("25A","Btm To Majestic", 15, 5);
		
		LocalBus lB2 = new LocalBus("Kb345", "Electronic city to St Johns", 20, 10);
		
		LocalBus lB3 = new LocalBus("500A", "Silk board to WhiteField", 25, 20);
	}

}
