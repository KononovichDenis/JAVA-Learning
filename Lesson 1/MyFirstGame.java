public class MyFirstGame {
	public static void main(String[] args) {
		int сompNumber = 0;
		int playerNumber = 2;

		System.out.println("Игра 'Угадай число'");
		System.out.println("Ваше число = " + playerNumber);
		do {
			int i = 0; i++;
			if (playerNumber > сompNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNumber--;
				System.out.println("Ваше число = " + playerNumber);
			}
			else if (playerNumber < сompNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				playerNumber++;
				System.out.println("Ваше число = " + playerNumber);
			}
		} while (playerNumber != сompNumber);
		System.out.println("Вы угадали!");
	}
}