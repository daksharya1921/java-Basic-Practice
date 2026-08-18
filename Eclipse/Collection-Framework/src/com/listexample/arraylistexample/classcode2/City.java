package com.listexample.arraylistexample.classcode2;

public class City {

	private String cityName;
	private int population;
	
	public City(String cityName,int population) {
		this.cityName = cityName;
		this.population = population;
	}
	
	public String getDetails() {
		return cityName +" "+population;
	}

	@Override
	public String toString() {
		return   cityName +" "+  population ;
	}
	
}
