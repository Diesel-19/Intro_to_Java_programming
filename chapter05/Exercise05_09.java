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
		
		System.out.println("Enter the amount point(-1 to end) and the name of the student");
		while (point != -1) {

			point = input.nextDouble();
			name = input.nextLine();

			if (point > first) {
				first = point;
				nameFirst = name;
			}
			if (first > point && point > second ) {
				second = point;
				nameSecond = name;
			}

		}
		System.out.println(first + " " + nameFirst);
		System.out.println(second + " " + nameSecond);
	}
}
