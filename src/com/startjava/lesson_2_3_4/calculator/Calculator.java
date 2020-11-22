package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

	private String expression;

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public void calculate() {
		String[] enteredExpression = expression.split(" ");
		int numberOne = Integer.parseInt(enteredExpression[0]);
		int numberTwo = Integer.parseInt(enteredExpression[2]);
		String mathSign = enteredExpression[1];
		switch(mathSign) {
			case "+":
				System.out.println(Math.addExact(numberOne, numberTwo));
				break;
			case "-":
				System.out.println(Math.subtractExact(numberOne, numberTwo));
				break;
			case "*":
				System.out.println(numberOne * numberTwo);
				break;
			case "/":
				if (numberTwo > 0) {
					System.out.println(numberOne / numberTwo);
				} else {
					System.out.println("Нельзя делить на 0!");
				}
				break;
			case "^":
				System.out.println(Math.pow(numberOne, numberTwo));
				break;
			case "%":
				System.out.println(numberOne % numberTwo);
				break;
			default:
				System.out.println("Числа не явлются положительными и/или целыми!");
		}			
	}
}