package com.listexample.arraylistexample.classcode2;

import java.util.ArrayList;
import java.util.List;

public class CityDetailsList implements Cloneable
{
	
	public ArrayList<City> addingData(){
		
		List<City> cityDetails = new ArrayList<City>(15);
		cityDetails.add(new City("Bihar Sharif" , 1000000));
		cityDetails.add(new City("Kolkata" , 20000000));
		cityDetails.add(new City("Patna" , 6000000));
		cityDetails.add(new City("Bengalure" , 500000000));
		cityDetails.add(new City("Mumbai" , 1000000000));
		cityDetails.add(new City("Kolkata" , 20000000));
		
		return (ArrayList<City>)cityDetails;
		
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
