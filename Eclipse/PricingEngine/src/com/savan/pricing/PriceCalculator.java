/* Price Calculation (Switch)
Product	Price
MOBILE	15000
LAPTOP	50000
TABLET	25000
HEADPHONE	2000 */

package com.savan.pricing;

public class PriceCalculator {
	
	public static double calculatePrice(ProductType productType) {
		
		switch (productType) {
		case MOBILE :
			return 15000;
		case LAPTOP :
			return 50000;
		case TABLET :
			return 25000;
		case HEADPHONE :
			return 2000;
			//break;

		default:
			return 0;
		}
	}
}
