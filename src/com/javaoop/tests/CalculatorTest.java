package com.javaoop.tests;

import com.javaoop.models.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
//		calculator.setNumOne(2);
//		calculator.setOperator('+');
//		calculator.setNumTwo(2);
//		calculator.performOperation();
//		calculator.getResults();
//
//		calculator.setNumOne(2);
//		calculator.setOperator('-');
//		calculator.setNumTwo(2);
//		calculator.performOperation();
//		calculator.getResults();
//		
//		calculator.setNumOne(2);
//		calculator.setOperator('*');
//		calculator.setNumTwo(15);
//		calculator.performOperation();
//		calculator.getResults();
//		
//		calculator.setNumOne(20);
//		calculator.setOperator('/');
//		calculator.setNumTwo(2);
//		calculator.performOperation();
//		calculator.getResults();
		
		calculator.getNumsAndPerformOps(5, '+', 5);
		calculator.getNumsAndPerformOps(5, '-', 5);
		calculator.getNumsAndPerformOps(5, '*', 5);
		calculator.getNumsAndPerformOps(5, '/', 5);
		
	}

}
