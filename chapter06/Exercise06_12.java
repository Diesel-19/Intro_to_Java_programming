package chapter06;

public class Exercise06_12 {
	public static void main(String[] args) {
		printChats('1', 'Z', 10);
	}

	public static void printChats(char ch1, char ch2, int numberPerLine) {
		int count = 0;
		if (ch1 < ch2) {
			for (int i = ch1; i <= ch2; i++) {
				System.out.print((char) i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		} else {
			for (int i = ch2; i <= ch1; i++) {
				System.out.print((char) i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
