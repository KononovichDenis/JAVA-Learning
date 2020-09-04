public class MyFirstGame {
	public static void main(String[] args) {
		int numberComp = 55;
		int startNumberPlayer = 0;

		System.out.println("Игра 'Угадай число'");
		System.out.println("Ваше число = " + startNumberPlayer);
		do {
			int i = 0; i++;
			if (startNumberPlayer > numberComp) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				startNumberPlayer -= i;
				System.out.println("Ваше число = " + startNumberPlayer);
			}
			if (startNumberPlayer < numberComp) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				startNumberPlayer += i;
				System.out.println("Ваше число = " + startNumberPlayer);
			} 
		} while (!(startNumberPlayer == numberComp));
		if (startNumberPlayer == numberComp) {
				System.out.println("Вы угадали!");
		}
	}
}