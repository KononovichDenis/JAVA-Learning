import java.util.Scanner;

class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Игра 'Угадай число'");
		System.out.print("Введите имя первого игрока: ");
		Player playerOne = new Player();
		playerOne.setName(sc.next());
		System.out.print("Введите имя второго игрока: ");
		Player playerTwo = new Player();
		playerTwo.setName(sc.next());
		GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);		

		guessNumber.play();
	}
}