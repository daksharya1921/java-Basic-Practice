package com.listexample.arraylistexample.classcode2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		CityDetailsList cdl = new CityDetailsList();
		
		ArrayList<City> details = cdl.addingData();
		//System.out.println(details);
		
		ArrayList<City> cityClone = (ArrayList<City> )details.clone();
		
		System.out.println(cityClone);
		
		//System.out.println(cdl.addingData().get(4));
	}
}
