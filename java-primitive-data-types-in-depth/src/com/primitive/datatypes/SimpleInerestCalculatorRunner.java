package com.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInerestCalculatorRunner {

	public static void main(String[] args) {

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);// 5 years
		System.out.println(totalValue);

	}

}
