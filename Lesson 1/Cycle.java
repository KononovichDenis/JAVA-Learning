public class Cycle {
	public static void main(String[] args) {
		System.out.println("Цикл for:");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Цикл while:");
		int k = 6;
		while (k >=- 6) {
			System.out.println(k);
			k-=2;
		}

		int l = 10;
		int sum = 0;
		System.out.println("");
		System.out.println("Цикл do-while:");
		do {
				l++;
				if (l % 2 != 0) {
					sum = sum + l;
					/*System.out.println(l);*/
				}
		} while (l < 20);
		System.out.println("Сумма нечетных чисел от 10 до 20 = " + sum);
	}
}