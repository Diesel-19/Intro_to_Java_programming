package chapter05;

public class Exercise05_18b {
	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			for (int k = 1; k <= 7 - i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}