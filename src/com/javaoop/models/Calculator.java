package com.javaoop.models;

public class Calculator {
	private double numOne;
	private double numTwo;
	private char operator;
	private double result;
	
	public Calculator() {
		
	}

	public double getNumOne() {
		return numOne;
	}

	public void setNumOne(double numOne) {
		this.numOne = numOne;
	}

	public double getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(double numTwo) {
		this.numTwo = numTwo;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public void getResults() {
		System.out.printf("\n%.2f %c %.2f = %.2f",
					this.getNumOne(),
					this.getOperator(),
					this.getNumTwo(),
					this.getResult()
				);
	}
	

	public void performOperation() {
		double result = 0;
		double num1 = this.getNumOne();
		double num2 = this.getNumTwo();
		char op = this.getOperator();
		
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Cannot Perform Operation.");
			break;
		}
		this.setResult(result);
	}
	
	public void getNumsAndPerformOps(double num1, char op, double num2) {
		double result = 0;
		this.setNumOne(num1);
		this.setOperator(op);
		this.setNumTwo(num2);
		
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Cannot Perform Operation.");
			break;
		}
		this.setResult(result);
		this.getResults();
	}
	
	
	
	
	
	
}
