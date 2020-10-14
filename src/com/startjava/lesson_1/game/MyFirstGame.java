package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int сompNumber = 10;
		int playerNumber = 0;

		System.out.println("Игра 'Угадай число'");
		System.out.println("Ваше число = " + playerNumber);
		do {
			if (playerNumber > сompNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNumber--;
				System.out.println("Ваше число = " + playerNumber);
			} else if (playerNumber < сompNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				playerNumber++;
				System.out.println("Ваше число = " + playerNumber);
			}
		} while (playerNumber != сompNumber);
		System.out.println("Вы угадали!");
	}
}