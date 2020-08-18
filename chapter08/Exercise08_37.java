package chapter08;

import java.util.Scanner;

public class Exercise08_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] capitals = { { "Albania", "Tirana" }, { "Austria", "Vienna" }, { "Belarus", "Minsk" },
				{ "Belgium", "Brussels" }, { "Turkey", "Ankara" } };
		int correctCount = 0;
		int i = 0;
		while (i != capitals.length) {
			System.out.println("What is the capital of " + capitals[i][0]);
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase(capitals[i][1])) {
				System.out.println("Your answer is correct");
				correctCount++;
			} else {
				System.out.println("The correct answer should be " + capitals[i][1]);
			}
			i++;
		}
		System.out.println("The correct count is " + correctCount);
	}
}
