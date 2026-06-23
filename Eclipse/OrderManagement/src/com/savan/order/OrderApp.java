package com.savan.order;

import com.savan.pricing.ProductType;

public class OrderApp {

	public static void main(String[] args) {

		try {

			ProductType productType =
					ProductType.valueOf(
							args[0].toUpperCase());

			String customerType =
					args[1];

			int quantity =
					Integer.parseInt(args[2]);

			Order.processOrder(
					productType,
					customerType,
					quantity);

		}
		catch(Exception e) {

			System.out.println(
					"Usage : "
					+ "MOBILE PREMIUM 3");

			System.out.println(
					e.getMessage());
		}
	}
}