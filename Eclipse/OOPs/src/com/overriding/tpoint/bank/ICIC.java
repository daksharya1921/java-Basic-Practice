package com.overriding.tpoint.bank;

public class ICIC extends Bank {
	
	@Override
	int getInterest() {
		return 2;
	}

}
