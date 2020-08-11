package chapter07;

import java.util.Scanner;

public class Exercise07_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int length = input.nextInt();
		int[] scores = new int[length];

		System.out.println("Enter " + length + " scores: ");
		for (int i = 0; i < length; i++) {
			scores[i] = input.nextInt();
		}

		int best = getBest(scores);

		System.out.println(getGrades(length, scores, best));

	}

	public static String getGrades(int length, int[] scores, int best) {
		String line = "";
		for (int i = 0; i < length; i++) {
			line += "Student " + i + " scores is ";
			if (scores[i] >= best - 10) {
				line += "A";
			} else if (scores[i] >= best - 20) {
				line += "B";
			} else if (scores[i] >= best - 30) {
				line += "C";
			} else if (scores[i] >= best - 40) {
				line += "D";
			} else {
				line += "F";
			}
			line += "\n";
		}
		return line;
	}

	public static int getBest(int[] scores) {
		int best = scores[0];
		for (int e : scores) {
			if (e > best) {
				best = e;
			}
		}
		return best;
	}
}
