public class Cycle {
	public static void main(String[] args) {
		System.out.println("Цикл for:");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("\nЦикл while:");
		int counter = 6;
		while (counter >= -6) {
			System.out.println(counter);
			counter -= 2;
		}

		System.out.println("\nЦикл do-while:");
		int min = 10;
		int max = 20;
		int sum = 0;
		do {
			if (min % 2 != 0) {
				sum += min;
			}
			min++;
		} while (min <= max);
		System.out.println("Сумма нечетных чисел от 10 до 20 = " + sum);
	}
}