package chapter03;

import java.util.Scanner;

public class Chapter03_SwitchDay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Give the number of a day: ");
		int day = input.nextInt();
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Wrong number");
		}
		System.out.println("Do you want to continue?");
		String answer = input.next();

		switch (answer.toLowerCase().charAt(0)) {
		case 'y':
			System.out.println("OK continue");
			break;
		case 'n':
			System.out.println("OK stop");
			break;
		default:
			System.out.println("Wrong answer");
		}
	}
}