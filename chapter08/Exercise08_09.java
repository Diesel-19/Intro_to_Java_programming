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
		// TODO printing
		while (!xWon && !draw && !yWon) {

			System.out.println("Enter a row (0, 1, 2) for player X:");
			int rowX = input.nextInt();
			System.out.println("Enter a column (0, 1, 2) for player X:");
			int columnX = input.nextInt();
			x[rowX][columnX] = true;
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x.length; j++) {
					System.out.print(" ");
					if (x[i][j] == true) {
						System.out.print("x");
					}
				}
				System.out.println();
			}
			if (testWin(x, rowX, columnX)) {
				xWon = true;
				break;
			}

			System.out.println("Enter a row (0, 1, 2) for player Y:");
			int rowY = input.nextInt();
			System.out.println("Enter a column (0, 1, 2) for player Y:");
			int columnY = input.nextInt();
			y[rowY][columnY] = true;
			if (testWin(y, rowY, columnY)) {
				yWon = true;
				break;
			}

		}
		if (xWon) {
			System.out.println("X won");
		} else if (yWon) {
			System.out.println("Y won");
		} else {
			System.out.println("Draw");
		}
	}

	public static boolean testWin(boolean[][] y, int rowY, int columnY) {
		boolean yTest = true;
		for (int i = 0; i < y.length; i++) {
			if (y[i][columnY] == false) {
				yTest = false;
			}
		}
		if (yTest) {
			return true;
		}
		for (int j = 0; j < y.length; j++) {
			if (y[rowY][j] == false) {
				yTest = false;
			}
		}
		if (yTest) {
			return true;
		}
		for (int i = 0; i < y.length; i++) {
			if (y[i][i] == false) {
				yTest = false;
			}
		}
		if (yTest) {
			return true;
		}
		for (int i = 0; i < y.length; i++) {
			if (y[i][2 - i] == false) {
				yTest = false;
			}
		}
		if (yTest) {
			return true;
		}
		return false;
	}
}
