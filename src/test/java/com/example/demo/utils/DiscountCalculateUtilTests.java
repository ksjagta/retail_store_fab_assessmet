package com.example.demo.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.util.Assert;

import com.example.demo.utils.DiscountCalculateUtil;
@RunWith(MockitoJUnitRunner.class)
public class DiscountCalculateUtilTests {
	@Mock
    private DiscountCalculateUtil util; 
	
	@Test
	void testGetPayableAmt() {
		int amt=util.getPayableAmt(1000,"emp");
		Assert.notNull(amt);
	}
}
