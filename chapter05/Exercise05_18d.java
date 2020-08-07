package chapter05;

public class Exercise05_18d {
	public static void main(String[] args) {
		int noOfRows = 6;
		for (int i = noOfRows + 1; i > 0; i--) {
			for (int k = 0; k < noOfRows + 1 - i; k++) {
				System.out.print("  ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
