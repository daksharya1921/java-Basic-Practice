/* REGULAR → 0%
PREMIUM → 10%
VIP → 20% */

package com.savan.pricing;

public class DiscountUtil {
	
	public static int calculateDiscount(String type) {
		
		if(type.equalsIgnoreCase("VIP")) {
			return 20;
		}
		else if(type.equalsIgnoreCase("PREMIUM")) {
			return 10;
		}
		else return 0;
	}

}
