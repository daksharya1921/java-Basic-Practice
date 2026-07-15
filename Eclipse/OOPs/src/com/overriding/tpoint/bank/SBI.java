package com.overriding.tpoint.bank;

public class SBI extends Bank{

	@Override
	int getInterest() {
		return 3;
	}
}
