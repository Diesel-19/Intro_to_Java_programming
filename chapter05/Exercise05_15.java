package chapter05;

public class Exercise05_15 {
	public static void main(String[] args) {
		int characterPerLine = 10;
		int count = 0;
		for (int i = 33; i <= 126; i++) {
			count++;
			char ch = (char) i;
			System.out.print(ch + " ");
			if (count % characterPerLine == 0) {
				System.out.println();
			}
		}
	}
}
