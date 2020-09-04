package chapter12.Exercise17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = "";
		try {
			word = getWord();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		boolean continueGame;
		do {
			play(word);
			System.out.println("Do you want to guess another word?");
			if (input.nextLine().toUpperCase().equals("YES")) {
				continueGame = true;
			} else {
				continueGame = false;
			}
		} while (continueGame);
		input.close();
	}

	public static void play(String word) {
		Scanner input = new Scanner(System.in);

		char[] guess = getHiddenWord(word);
		for (int i = 0; i < guess.length; i++) {
			System.out.print(guess[i]);
		}
		System.out.println();

		boolean completed;
		do {
			boolean guessedCorrectly = false;
			boolean isInWord = false;
			completed = true;

			System.out.println("Enter a letter");

			String str = input.next();
			char guessedLetter = str.charAt(0);
			for (int i = 0; i < word.length(); i++) {
				if (guessedLetter == word.charAt(i)) {
					if (guess[i] == '*') {
						guess[i] = guessedLetter;
					} else {
						isInWord = true;
					}
					guessedCorrectly = true;
				}
			}
			if (isInWord) {
				System.out.println(guessedLetter + " is already in the word");
			}
			if (!guessedCorrectly) {
				System.out.println("Wrong guess");
			}
			System.out.println(guess);

			for (int i = 0; i < word.length(); i++) {
				if (guess[i] == '*') {
					completed = false;
				}
			}
		} while (!completed);
		System.out.println("You won!");
	}

	public static char[] getHiddenWord(String word) {
		char[] guess = new char[word.length()];
		for (int i = 0; i < guess.length; i++) {
			guess[i] = '*';
		}
		return guess;
	}

	public static String getWord() throws FileNotFoundException {
		File file = new File("src/chapter12/Exercise17/hangman.txt");
		Scanner input = new Scanner(file);
		ArrayList<String> words = new ArrayList<>();
		while (input.hasNext()) {
			words.add(input.nextLine());
		}
		input.close();
		Collections.shuffle(words);
		String word = words.get(0);
		return word;
	}
}