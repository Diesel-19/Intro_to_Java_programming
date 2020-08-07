package chapter05;

public class Exercise05_19 {
	public static void main(String[] args) {
		int numberOfRows = 8;
		for (int k = 0; k < numberOfRows; k++) {
			for (int i = 0; i < numberOfRows - k - 1; i++) {
				System.out.print("    ");
			}
			for (int i = 0; i <= k; i++) {
				System.out.printf("%-4d", (int) Math.pow(2, i));
			}
			for (int i = k - 1; i >= 0; i--) {
				System.out.printf("%-4d", (int) Math.pow(2, i));
			}
			System.out.println();
		}
	}

}
