package chapter07;

public class Exercise07_06 {
	public static void main(String[] args) {
		int[] primeNumbers = new int[50];
		primeNumbers[0] = 2;
		primeNumbers[1] = 3;
		int index = 2;
		for (int i = 5; primeNumbers[49] == 0; i++) {
			for (int j = 2; j < 49 && index < 50 && primeNumbers[j] != 0 && Math.sqrt(i) >= primeNumbers[j]
					&& i % primeNumbers[j] == 0; j++) {

				if (i % primeNumbers[j] != 0 && primeNumbers[j + 1] == 0) {
					primeNumbers[index] = i;
					index++;
				}
			}
		}
		int count = 0;
		for (int i : primeNumbers) {
			System.out.print(i + " ");
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}

	}
}
