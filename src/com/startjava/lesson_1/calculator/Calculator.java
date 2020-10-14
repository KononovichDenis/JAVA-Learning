package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int numberOne = 17;
		int numberTwo = 5;
		char mathSign = '+';

		if (numberOne > 0 & numberTwo > 0) {
			System.out.print(numberOne + " " + mathSign + " " + numberTwo + " " + "= ");
			if (mathSign == '+') {
				numberOne += numberTwo;
				System.out.println(numberOne);
			} else if (mathSign == '-') {
				numberOne -= numberTwo;
				System.out.println(numberOne);
			} else if (mathSign == '*') {
				numberOne *= numberTwo;
				System.out.println(numberOne);
			} else if (mathSign == '/') {
				if (numberTwo > 0) {
					numberOne /= numberTwo;
					System.out.println(numberOne);
				}
			} else if (mathSign == '^') {
				if (numberTwo > 0) {
					int degree = 1;
					for (int i = 1; i <= numberTwo; i++) {
						degree *= numberOne;
					}
					System.out.println(degree);
				}
			} else if (mathSign == '%') {
				numberOne %= numberTwo;
				System.out.println(numberOne);
			}
		} else {
			System.out.println("Числа не явлются положительными и/или целыми!");
		}
	}
}