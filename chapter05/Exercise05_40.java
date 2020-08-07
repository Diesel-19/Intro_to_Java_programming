package chapter05;

public class Exercise05_40 {
	public static void main(String[] args) {
		int tailsCount = 0;
		int headsCount = 0;
		for (int i = 0; i < 1_000_000; i++) {
			if ((int) (Math.random() * 2) == 0) {
				tailsCount++;
			} else {
				headsCount++;
			}
		}
		System.out.println("Tails: " + tailsCount + "\nHeads: " + headsCount);
	}
}
