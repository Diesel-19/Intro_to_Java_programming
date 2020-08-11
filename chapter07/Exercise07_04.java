package chapter07;

import java.util.Scanner;

public class Exercise07_04 {
	public static void main(String[] args) {
		int[] scoresArray = new int[100];
		Scanner input = new Scanner(System.in);

		int score = 0;
		int count = 0;
		int sum = 0;
		int i = 0;
		System.out.println("Enter numbers: ");
		while (score >= 0) {
			score = input.nextInt();
			count++;
			sum += score;
			scoresArray[i] = score;
			i++;
		}
		sum = sum - score;
		i -= 1;
		double average = (double) sum / i;

		printAverageCounts(scoresArray, average);
	}

	private static void printAverageCounts(int[] scoresArray, double average) {
		int aboveAverageCount = 0;
		int averageCount = 0;
		int belowAverageCount = 0;
		for (int j = 0; j < scoresArray.length; j++) {
			if (scoresArray[j] < 0) {
				break;
			} else if (scoresArray[j] > average) {
				aboveAverageCount++;
			} else if (scoresArray[j] == average) {
				averageCount++;
			} else {
				belowAverageCount++;
			}
		}
		System.out.println("Above average: " + aboveAverageCount);
		System.out.println("Average: " + averageCount);
		System.out.println("Below average: " + belowAverageCount);
	}
}
