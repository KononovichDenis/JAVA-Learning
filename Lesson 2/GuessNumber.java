import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		generateGuessNumber = generateGuessNumber(max);
	}

	Scanner sc = new Scanner(System.in);
	private Player playerOne;
	private Player playerTwo;

	private int max = 100;
	private int generateGuessNumber = generateGuessNumber(max);
	public int generateGuessNumber(int max) {
		return (int) (Math.random() * ++max);
	}

	public void play() {
		do {
			System.out.print(playerOne.getName() + ", введите ваше число: ");
			playerOne.setNumber(sc.nextInt());

			if (playerOne.getNumber() > generateGuessNumber) {
				System.out.println(playerOne.getName() + ", введенное вами число больше того, что загадал компьютер");
			} else if (playerOne.getNumber() < generateGuessNumber) {
				System.out.println(playerOne.getName() + ", введенное вами число меньше того, что загадал компьютер");
			} else if (playerOne.getNumber() == generateGuessNumber) {
				System.out.println(playerOne.getName() + ", вы угадали!");
				return;
			}

			if (playerOne.getNumber() != generateGuessNumber) {
				System.out.print(playerTwo.getName() + ", введите ваше число: ");
				playerTwo.setNumber(sc.nextInt());

				if (playerTwo.getNumber() > generateGuessNumber) {
					System.out.println(playerTwo.getName() + ", введенное вами число больше того, что загадал компьютер");
				} else if (playerTwo.getNumber() < generateGuessNumber) {
					System.out.println(playerTwo.getName() + ", введенное вами число меньше того, что загадал компьютер");
				} else if (playerTwo.getNumber() == generateGuessNumber) {
					System.out.println(playerTwo.getName() + ", вы угадали!");
					return;
				}
			}
		} while (true);
	}
}