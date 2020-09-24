import java.util.Scanner;
/*
GuessNumberTest — отвечает за создание объектов, их инициализации, запуска игры. Содержит метод main
*/
class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GuessNumber guessNumber = new GuessNumber();
		Player playerOne = new Player();
		System.out.println("Игра 'Угадай число'");
		System.out.print("Введите имя первого игрока: ");
		playerOne.setName(sc.next());
		Player playerTwo = new Player();
		System.out.print("Введите имя второго игрока: ");
		playerTwo.setName(sc.next());
		System.out.print(playerOne.getName() + ", введите ваше число: ");
		playerOne.setNumber(sc.nextInt());
		System.out.print(playerTwo.getName() + ", введите ваше число: ");
		playerTwo.setNumber(sc.nextInt());

		guessNumber.play();
		/*do {

		} while ();*/
	}
}