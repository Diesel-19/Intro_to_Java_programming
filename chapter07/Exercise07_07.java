package chapter07;

public class Exercise07_07 {
	public static void main(String[] args) {
		int[] counts = new int[10];
		int[] randomNumbers = new int[100];

		for (int i = 0; i < 100; i++) {
			randomNumbers[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				if (randomNumbers[i] == j) {
					counts[j]++;
					break;
				}
			}
		}
		print(counts, randomNumbers);
	}

	public static void print(int[] counts, int[] randomNumbers) {
		int counter = 0;
		for (int i = 0; i < 100; i++) {
			System.out.print(randomNumbers[i] + " ");
			counter++;
			if (counter % 10 == 0)
				System.out.println();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " occur " + counts[i] + " times");
		}
	}
}
