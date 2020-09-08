public class Calculator {
	public static void main(String[] args) {
		int numberOne = 17;
		int numberTwo = 5;
		char equalSign = '+';

		if (numberOne > 0 & numberTwo > 0 & numberOne == (int) numberOne & numberTwo == (int) numberTwo) {
			System.out.print(numberOne + " " + equalSign + " " + numberTwo + " " + "= ");
			if (equalSign == '+') {
				numberOne += numberTwo;
				System.out.println(numberOne);
			}
			else if (equalSign == '-') {
				numberOne -= numberTwo;
				System.out.println(numberOne);
			}
			else if (equalSign == '*') {
				numberOne *= numberTwo;
				System.out.println(numberOne);
			}
			else if (equalSign == '/') {
				if (numberTwo > 0) {
					numberOne /= numberTwo;
					System.out.println(numberOne);
				}
			}
			else if (equalSign == '^') {
				if (numberTwo > 0) {
					int degree = 1;
					for (int i = 1; i <= numberTwo; i++) {
						degree *= numberOne;
					}
					System.out.println(degree);
				}
			}
			else if (equalSign == '%') {
				numberOne %= numberTwo;
				System.out.println(numberOne);
			}
		} else {
			System.out.println("Числа не явлются положительными и/или целыми!");
		}
	}
}