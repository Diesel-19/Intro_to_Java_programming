package chapter05;

public class Exercise05_18c {
	public static void main(String[] args) {
		int noOfRows = 6;
		for (int i = 1; i < noOfRows + 1; i++) {
			for (int k = 1; k < noOfRows + 1 - i; k++) {
				System.out.print("  ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
