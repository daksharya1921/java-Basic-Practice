package com.overriding.tpoint.bank;

public class AXIS  extends Bank{

	@Override
	int getInterest() {
		return 5;
	}
}
