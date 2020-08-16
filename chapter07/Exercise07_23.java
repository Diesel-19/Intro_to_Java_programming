package chapter07;

public class Exercise07_23 {
	public static void main(String[] args) {
		boolean isOpen[] = new boolean[100];
		for (int i = 1; i <= 100; i++) {
			for (int j = i; j <= 100; j++) {
				isOpen[j - 1] = (isOpen[j - 1] == true) ? false : true;
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println((i + 1) + ". locker: " + isOpen[i] + " ");
		}
	}
}
