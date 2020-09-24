import java.lang.Math;

public class GuessNumber {

		public int сompNumber = 10;
		public int generateCompNumber(int min, int max) {
			min = 0;
			max = 100;
			return min + (int)(Math.random() * ((max - min) + 1));
		}

		/*Player playerOne = new Player();*/

		public void play() {
			playerOne.getNumber();
			playerTwo.getNumber();

			System.out.println("Число компьютера " + compNumber);
			System.out.println("START!");
			System.out.println("Число игрока 1 " + playerOne.getNumber());
			System.out.println("Число игрока 2 " + playerTwo.getNumber());
			do {
			if ((playerOne.getNumber() || playerTwo.getNumber()) > сompNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if ((playerOne.getNumber() || playerTwo.getNumber()) < сompNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			}
			} while ((playerOne.getNumber() || playerTwo.getNumber()) != сompNumber);
			System.out.println("Вы угадали!");
		}
}