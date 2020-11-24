package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
		int i = 0;
		checkMoves(playerOne, i);
		checkMoves(playerTwo, i);
	}

	private void enterNumber(Player player, int i) {
		System.out.print(player.getName() + ", введите ваше число: ");
		player.setNumber(sc.nextInt());
		player.setEnteredNumbers(i);
	}

	private void checkMoves(Player player, int i) {
		for (i = 0; i < 10; i++) {
			System.out.println("У вас " + (10 - i) + " попыток");

			enterNumber(playerOne, i);
			enterNumber(playerTwo, i);

			checkNumber(playerOne, i);
			checkNumber(playerTwo, i);

			if (i == 9 && (playerOne.getNumber()  != hiddenNumber && playerTwo.getNumber() != hiddenNumber)) {
				System.out.println("У " + playerOne.getName() + " закончились попытки");
				showEnterNumbers(playerOne, playerOne.getEnteredNumbers().length);
				System.out.println("У " + playerTwo.getName() + " закончились попытки");
				showEnterNumbers(playerTwo, playerTwo.getEnteredNumbers().length);
			}
		}
	}

	private void checkNumber(Player player, int i) {
		if (player.getNumber() > hiddenNumber) {
			System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
		} else if (player.getNumber() < hiddenNumber) {
			System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
		} else if (player.getNumber() == hiddenNumber) {
			defineWinner(player, playerTwo, i);
			return;
		}
	}
	
	private void defineWinner(Player player, Player playerTwo, int i) {
		System.out.println(player.getName() + ", вы угадали!");
		System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + (i + 1) + " попытки");
		showEnterNumbers(playerOne, playerOne.getEnteredNumbers().length);
		showEnterNumbers(playerTwo, playerTwo.getEnteredNumbers().length);
	}
	
	private void showEnterNumbers(Player player, int i) {
		int[] enteredNumbers = Arrays.copyOf(player.getEnteredNumbers(), i);
		System.out.print(player.getName() + " вводил следующие числа: ");
		for (i = 0; i < enteredNumbers.length; i++){
			System.out.print(enteredNumbers[i] + " ");
		}
		System.out.println();

		Arrays.fill(player.getEnteredNumbers(), 0);
	}
}