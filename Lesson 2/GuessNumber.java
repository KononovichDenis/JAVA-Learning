import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	Scanner sc = new Scanner(System.in);
	private int max = 100;
	private int compNumber = compNumber(max);
	private Player playerOne;
	private Player playerTwo;
	private int guessNumber;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public static int compNumber(int max)
	{
		return (int) (Math.random() * ++max);
	}

	public void play() {
		do {
			System.out.print(playerOne.getName() + ", введите ваше число: ");
			playerOne.setNumber(sc.nextInt());

			System.out.print(playerTwo.getName() + ", введите ваше число: ");
			playerTwo.setNumber(sc.nextInt());

			if (playerOne.getNumber() > compNumber) {
				System.out.println(playerOne.getName() + ", введенное вами число больше того, что загадал компьютер");
			} else if (playerOne.getNumber() < compNumber) {
				System.out.println(playerOne.getName() + ", введенное вами число меньше того, что загадал компьютер");
			} else if (playerOne.getNumber() == compNumber) {
				System.out.println(playerOne.getName() + ", вы угадали!");
				return;
			}

			if (playerTwo.getNumber() > compNumber) {
				System.out.println(playerTwo.getName() + ", введенное вами число больше того, что загадал компьютер");
			} else if (playerTwo.getNumber() < compNumber) {
				System.out.println(playerTwo.getName() + ", введенное вами число меньше того, что загадал компьютер");
			} else if (playerTwo.getNumber() == compNumber) {
				System.out.println(playerTwo.getName() + ", вы угадали!");
				return;
			}
		} while ((playerOne.getNumber() != compNumber) || (playerTwo.getNumber() != compNumber));
	}
}