public class Calculator {

		private int numberOne;
		private int numberTwo;
		private char mathSign;

		public void setNumberOne(int numberOne) {
			this.numberOne = numberOne;
		}

		public int getNumberOne() {
			return numberOne;
		}

		public void setNumberTwo(int numberTwo) {
			this.numberTwo = numberTwo;
		}

		public int getNumberTwo() {
			return numberTwo;
		}

		public void setMathSign(char mathSign) {
			this.mathSign = mathSign;
		}

		public int getMathSign() {
			return mathSign;
		}

		public void calculate() {
			switch(mathSign) {
				case '+':
					System.out.println(numberOne + numberTwo);
				break;
				case '-':
					System.out.println(numberOne - numberTwo);
				break;
				case '*':
					System.out.println(numberOne * numberTwo);
				break;
				case '/':
					if (numberTwo > 0) {
						System.out.println(numberOne / numberTwo);
					} else {
						System.out.println("Нельзя делить на 0!");
					}
				break;
				case '^':
					if (numberTwo > 0) {
						int degree = 1;
						for (int i = 1; i <= numberTwo; i++) {
							degree *= numberOne;
						}
						System.out.println(degree);
					}
				break;
				case '%':
					System.out.println(numberOne % numberTwo);
				break;
				default:
					System.out.println("Числа не явлются положительными и/или целыми!");
			}			
		}
}