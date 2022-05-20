package com.example.demo;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.User;
import com.example.demo.utils.DiscountCalculateUtil;

/**
 * @author Karishma Jagtap
 *
 */
@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LogManager.getLogger("DemoApplication");

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter market price:");
		int markpetPrice = sc.nextInt();

		System.out.println("Enter custType:");
		String custType = sc.next();
		DiscountCalculateUtil getAmt = new DiscountCalculateUtil();
		int netAmountPayable = getAmt.getPayableAmt(markpetPrice, custType);
		logger.debug("Net Payable AmouNt is:", netAmountPayable);
	}

	User getUser() {
		User user = new User();
		user.setCustomerId("1234");
		user.setCustType("emp");
		return user;
	}

}