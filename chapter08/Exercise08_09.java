package chapter08;

import java.util.Scanner;

public class Exercise08_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean yWon = false;
		boolean xWon = false;
		boolean draw = false;
		boolean[][] x = new boolean[3][3];
		boolean[][] y = new boolean[3][3];
		printBoard(x, y);
		while (!xWon && !draw && !yWon) {
			boolean validInput = true;
			int rowX = -1;
			int columnX = -1;
			int rowY = -1;
			int columnY = -1;
			// get input from user x
			do {
				validInput = true;
				System.out.println("Enter a row (0, 1, 2) for player X:");
				rowX = input.nextInt();
				System.out.println("Enter a column (0, 1, 2) for player X:");
				columnX = input.nextInt();
				// check if the input is valid
				if ((rowX < 0 || 2 < rowX || columnX < 0 || 2 < columnX)) {
					System.out.println("Invalid Input, try again");
					validInput = false;
				}
				if (rowY != -1) {
					if (x[rowY][columnY] || y[rowY][columnY]) {
						System.out.println("Invalid Input, try again");
						validInput = false;
					}
				}
			} while (!validInput);

			x[rowX][columnX] = true;

			printBoard(x, y);

			// check if x won
			if (testWin(x)) {
				xWon = true;
				break;
			}
			if (testDraw(x, y)) {
				draw = true;
				break;
			}
			// get input from user y
			do {
				validInput = true;
				System.out.println("Enter a row (0, 1, 2) for player Y:");
				rowY = input.nextInt();
				System.out.println("Enter a column (0, 1, 2) for player Y:");
				columnY = input.nextInt();
				// check if the input is valid
				if ((rowY < 0 || 2 < rowY || columnY < 0 || 2 < columnY)) {
					System.out.println("Invalid Input, try again");
					validInput = false;
				}

				if (x[rowY][columnY] || y[rowY][columnY]) {
					System.out.println("Invalid Input, try again");
					validInput = false;
				}
			} while (!validInput);

			y[rowY][columnY] = true;

			printBoard(x, y);

			// check if y won
			if (testWin(y)) {
				yWon = true;
				break;
			}

		}
		// print winner
		if (xWon) {
			System.out.println("X won");
		} else if (yWon) {
			System.out.println("Y won");
		} else if (draw) {
			System.out.println("Draw");
		}
	}

	private static boolean testDraw(boolean[][] x, boolean[][] y) {
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (!x[i][j] && !y[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	private static void printBoard(boolean[][] x, boolean[][] y) {
		System.out.println("-------------");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print("|");
				if (x[i][j]) {
					System.out.print(" x ");
				} else if (y[i][j]) {
					System.out.print(" o ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println("|");
			System.out.println("-------------");
		}

	}

	public static boolean testWin(boolean[][] game) {
		// test rows
		boolean test = true;
		for (int i = 0; i < game.length; i++) {
			test = true;
			for (int j = 0; j < game.length; j++) {
				if (game[i][j] == false) {
					test = false;
				}
			}
			if (test) {
				return true;
			}
		}
		// test columns
		test = true;
		for (int j = 0; j < game.length; j++) {
			test = true;
			for (int i = 0; i < game.length; i++) {
				if (game[i][j] == false) {
					test = false;
				}
			}
			if (test) {
				return true;
			}
		}

		// test major diagonal
		test = true;
		for (int i = 0; i < game.length; i++) {
			if (game[i][i] == false) {
				test = false;
			}
		}
		if (test) {
			return true;
		}
		// test sub-diagonal
		test = true;
		for (int i = 0; i < game.length; i++) {
			if (game[i][2 - i] == false) {
				test = false;
			}
		}
		if (test) {
			return true;
		}
		return false;
	}
}