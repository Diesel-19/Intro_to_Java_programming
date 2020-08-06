package chapter05;

import java.util.Scanner;

public class Exercise05_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double point = 0;
		double temp = point;
		String comb = "";
		while (true) {
			System.out.println("Enter the amount point(-1 to end): ");
			point = input.nextDouble();
			if (point == -1) {
				break;
			}
			System.out.println("Enter name of the student: ");
			String name = input.nextLine();
			name = input.nextLine();

			if (point > temp) {
				temp = point;
				comb = temp + " " + name;
			}
		}
		System.out.println(comb);

	}

}
