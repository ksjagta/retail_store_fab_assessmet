package com.example.demo.retailstore.mapper;

/**
 * @author Karishma Jagtap
 *
 */
public class Mapper {
	public static int getDiscount(String custType) {
		int discount = 0;

		if (custType.equalsIgnoreCase("emp")) {
			discount = 30;
		} else if (custType.equalsIgnoreCase("affiliator")) {
			discount = 10;
		}
		if (custType.equalsIgnoreCase("olduser")) {
			discount = 5;
		}
		return discount;

	}

}
