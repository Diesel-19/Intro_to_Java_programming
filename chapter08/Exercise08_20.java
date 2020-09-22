package chapter08;

import java.util.Scanner;

public class Exercise08_20 {
	private static final int ROW = 6;
	private static final int COLUMN = 7;

	public static void main(String[] args) {
		game();
	}

	private static void game() {
		Scanner input = new Scanner(System.in);

		boolean[][] red = new boolean[ROW][COLUMN];
		boolean[][] yellow = new boolean[ROW][COLUMN];
		printBoard(red, yellow);
		int[] height = new int[COLUMN];

		while (gameStatus(red, yellow, height) == -1) {
			System.out.println("Drop a red disk at column (0-6)");
			int column = 7;
			while (column < 0 || 6 < column) {
				column = input.nextInt();
			}
			red[ROW - height[column] - 1][column] = true;
			height[column]++;
			printBoard(red, yellow);
			if (gameStatus(red, yellow, height) != -1) {
				break;
			}

			System.out.println("Drop a yellow disk at column (0-6)");
			column = 7;
			while (column < 0 || 6 < column) {
				column = input.nextInt();
			}
			yellow[ROW - height[column] - 1][column] = true;
			height[column]++;
			printBoard(red, yellow);
		}
		if (gameStatus(red, yellow, height) == 1) {
			System.out.println("Red won");
		} else if (gameStatus(red, yellow, height) == 2) {
			System.out.println("Yellow won");
		} else {
			System.out.println("Draw");
		}
	}

	private static int gameStatus(boolean[][] red, boolean[][] yellow, int[] height) {
		// check horizontal
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN - 3; j++) {
				if (red[i][j] && red[i][j + 1] && red[i][j + 2] && red[i][j + 3]) {
					return 1;
				} else if (yellow[i][j] && yellow[i][j + 1] && yellow[i][j + 2] && yellow[i][j + 3]) {
					return 2;
				}
			}
		}

		// check vertical
		for (int i = 0; i < COLUMN; i++) {
			for (int j = 0; j < ROW - 3; j++) {
				if (red[j][i] && red[j + 1][i] && red[j + 2][i] && red[j + 3][i]) {
					return 1;
				} else if (yellow[j][i] && yellow[j + 1][i] && yellow[j + 2][i] && yellow[j + 3][i]) {
					return 2;
				}
			}
		}
		// check main diagonals
		for (int i = 0; i < ROW - 3; i++) {
			for (int j = 0; j < COLUMN - 3; j++) {
				if (red[i][j] && red[i + 1][j + 1] && red[i + 2][j + 2] && red[i + 3][j + 3]) {
					return 1;
				} else if (yellow[i][j] && yellow[i + 1][j + 1] && yellow[i + 2][j + 2] && yellow[i + 3][j + 3]) {
					return 2;
				}
			}
		}

		// check sub diagonals
		for (int i = 0; i < ROW - 3; i++) {
			for (int j = 3; j < COLUMN; j++) {
				if (red[i][j] && red[i + 1][j - 1] && red[i + 2][j - 2] && red[i + 3][j - 3]) {
					return 1;
				} else if (yellow[i][j] && yellow[i + 1][j - 1] && yellow[i + 2][j - 2] && yellow[i + 3][j - 3]) {
					return 2;
				}
			}
		}

		// check draw
		{
			boolean draw = true;
			for (int i = 0; i < height.length; i++) {
				if (height[i] != ROW) {
					draw = false;
				}
			}
			if (draw) {
				return 0;
			}
		}

		return -1;
	}

	private static void printBoard(boolean[][] red, boolean[][] yellow) {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.print("|");
				if (red[i][j] == true) {
					System.out.print("R");
				} else if (yellow[i][j] == true) {
					System.out.print("Y");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("|");
		}
		System.out.println("---------------");
	}
}
