package chapter06;

public class Exercise06_38 {
	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		for (int i = 0; i < 100; i++) {
			System.out.print(Chapter06_RandomCharacter.getRandomUpperCaseLetter() + " ");
			count++;
			if (count % NUMBER_PER_LINE == 0) {
				System.out.println();
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.print(Chapter06_RandomCharacter.getRandomDigitCharacter() + " ");
			count++;
			if (count % NUMBER_PER_LINE == 0) {
				System.out.println();
			}
		}
	}
}
