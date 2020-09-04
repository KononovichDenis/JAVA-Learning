public class MyFirstGame {
	public static void main(String[] args) {
		int i = 3; /* число компьютера */
		int k = 2; /* число игрока */

		System.out.println("Игра 'Угадай число' версия 0.0.1 бета");
		if (k > i) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (k < i) {
					System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали!");
		}
	}
}