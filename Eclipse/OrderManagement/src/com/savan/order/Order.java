package com.savan.order;

import com.savan.pricing.DiscountUtil;
import com.savan.pricing.PriceCalculator;
import com.savan.pricing.ProductType;

public class Order {

	public static void processOrder(
			ProductType productType,
			String customerType,
			int quantity) {

		if(quantity <= 0) {
			throw new IllegalArgumentException(
					"Quantity must be greater than 0");
		}

		double unitPrice =
				PriceCalculator.calculatePrice(productType);

		double totalAmount =
				unitPrice * quantity;

		int discountPercent =
				DiscountUtil.calculateDiscount(customerType);

		double discountAmount =
				(totalAmount * discountPercent) / 100;

		double finalAmount =
				totalAmount - discountAmount;

		System.out.println("Product :: " + productType);
		System.out.println("Unit Price :: " + unitPrice);

		System.out.println();

		for(int i=1;i<=quantity;i++) {

			System.out.println(
					"Item-" + i + " Packed");
		}

		System.out.println();

		System.out.println(
				"Total Amount :: "
				+ totalAmount);

		System.out.println(
				"Discount :: "
				+ discountPercent + "%");

		System.out.println(
				"Final Amount :: "
				+ finalAmount);
	}
}