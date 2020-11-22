package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
	public static void main(String[] args) {
		String userResponse = "yes";
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);

		while(userResponse.equals("yes")) {
			System.out.print("Введите математическое выражение: ");
			calculator.setExpression(sc.nextLine());
			calculator.calculate();

			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				userResponse = sc.next();
			} while(!userResponse.equals("yes") && !userResponse.equals("no"));
		}
	}
}