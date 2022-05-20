package com.example.demo.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.demo.retailstore.mapper.CalculateDiscount;
import com.example.demo.retailstore.mapper.Mapper;

/**
 * @author Karishma Jagtap
 *
 */
public class DiscountCalculateUtil implements CalculateDiscount {
	private static final Logger logger = LogManager.getLogger("DiscountCalculateUtil");

	public int getPayableAmt(int marketPrice, String custType) {
		int discount = Mapper.getDiscount(custType);
		int discountAmt = getDiscountAmount(marketPrice, discount);
		int payableAmount = marketPrice - discountAmt;
		logger.info("Emp payable Amount:" + payableAmount);
		int netAmt = payableAmount - ((5 * payableAmount)) / 100;
		return netAmt;
	}

	@Override
	public int getDiscountAmount(int marketprice, int s) {
		int amount = (s * marketprice) / 100;
		logger.debug("Discount Amount:" + amount);
		return amount;

	}

}
