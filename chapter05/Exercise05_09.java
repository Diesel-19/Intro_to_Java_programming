package chapter05;

import java.util.Scanner;

public class Exercise05_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double point = 0;
		double first = 0;
		double second = 0;
		String name = "";
		String nameFirst = "";
		String nameSecond = "";

		System.out.println("Enter the amount of students, amount point and the name of the student");
		int noOfStudent = input.nextInt();
		while (noOfStudent > 0) {

			point = input.nextDouble();
			name = input.nextLine();

			if (point > second) {

				if (point > first) {
					second = first;
					nameSecond = nameFirst;
					first = point;
					nameFirst = name;
				} else {
					second = point;
					nameSecond = name;
				}
				second = point;
				nameSecond = name;
			}

			noOfStudent--;
		}
		System.out.println(first + " " + nameFirst);
		System.out.println(second + " " + nameSecond);
	}
}
