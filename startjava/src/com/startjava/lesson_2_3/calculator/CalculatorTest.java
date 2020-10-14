package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

class CalculatorTest {
	public static void main(String[] args) {
		String userResponse = "да";
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);

		while(userResponse.equals("да")) {
			System.out.print("Введите первое число: ");
			calculator.setNumberOne(sc.nextInt());
			System.out.print("Введите знак математической операции: ");
			calculator.setMathSign(sc.next().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setNumberTwo(sc.nextInt());
			calculator.calculate();

			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				userResponse = sc.next();
			} while(!userResponse.equals("да") && !userResponse.equals("нет"));
		}
	}
}