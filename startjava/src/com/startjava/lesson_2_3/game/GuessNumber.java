package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	Scanner sc = new Scanner(System.in);
	private Player playerOne;
	private Player playerTwo;
	private int max = 100;
	private int hiddenNumber;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		hiddenNumber = generateGuessNumber(max);
	}

	private int generateGuessNumber(int max) {
		return (int) (Math.random() * ++max);
	}

	public void play() {
		do {
			System.out.print(playerOne.getName() + ", введите ваше число: ");
			playerOne.setNumber(sc.nextInt());

			if (playerOne.getNumber() > hiddenNumber) {
				System.out.println(playerOne.getName() + ", введенное вами число больше того, что загадал компьютер");
			} else if (playerOne.getNumber() < hiddenNumber) {
				System.out.println(playerOne.getName() + ", введенное вами число меньше того, что загадал компьютер");
			} else if (playerOne.getNumber() == hiddenNumber) {
				System.out.println(playerOne.getName() + ", вы угадали!");
				return;
			}

			if (playerOne.getNumber() != hiddenNumber) {
				System.out.print(playerTwo.getName() + ", введите ваше число: ");
				playerTwo.setNumber(sc.nextInt());

				if (playerTwo.getNumber() > hiddenNumber) {
					System.out.println(playerTwo.getName() + ", введенное вами число больше того, что загадал компьютер");
				} else if (playerTwo.getNumber() < hiddenNumber) {
					System.out.println(playerTwo.getName() + ", введенное вами число меньше того, что загадал компьютер");
				} else if (playerTwo.getNumber() == hiddenNumber) {
					System.out.println(playerTwo.getName() + ", вы угадали!");
					return;
				}
			}
		} while (true);
	}
}