package chapter07;

public class Exercise07_06 {
	public static void main(String[] args) {
		int[] primeNumbers = new int[50];
		primeNumbers[0] = 2;
		primeNumbers[1] = 3;
		int index = 2;
		for (int i = 5; primeNumbers[49] == 0; i++) {
			boolean isDivisible = false;
			for (int j = 0; j < index && index < 50 && Math.sqrt(i) >= primeNumbers[j]; j++) {

				if (i % primeNumbers[j] == 0) {
					isDivisible = true;
				}
			}
			if (!isDivisible) {
				primeNumbers[index] = i;
				index++;
			}
		}
		printPrimeNumbers(primeNumbers);

	}

	public static void printPrimeNumbers(int[] primeNumbers) {
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
