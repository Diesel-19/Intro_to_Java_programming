package chapter07;

import java.util.Scanner;

public class Exercise07_05 {
	public static void main(String[] args) {
		int[] numbers = new int[10];

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println("The number of distinct number is: " + getDistinctNumberAmount(numbers));
		System.out.println("The distinct numbers are: ");
		int[] distinctNumbers = getDistinctNumbersArray(numbers);
		for (int i : distinctNumbers) {
			System.out.print(i + " ");
		}
	}

	public static int getDistinctNumberAmount(int[] numbers) {
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			boolean isEqual = true;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					isEqual = false;
					break;
				}
			}
			if (isEqual != false) {
				count++;
			}

		}
		return count;
	}

	public static int[] getDistinctNumbersArray(int[] numbers) {
		int[] distinctNumbers = new int[getDistinctNumberAmount(numbers)];
		int index = 0;

		for (int i = 0; i < numbers.length; i++) {
			boolean isEqual = false;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j] && i != j) {
					if (j < i) {
						isEqual = true;
						break;
					}
					isEqual = true;
					if (i < j) {
						distinctNumbers[index] = numbers[i];
						index++;
						break;
					}
				}

			}
			if (isEqual == false) {
				distinctNumbers[index] = numbers[i];
				index++;
			}
		}

		return distinctNumbers;
	}
}
