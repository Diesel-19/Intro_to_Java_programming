package chapter05;

import java.util.Scanner;

public class Exercise05_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.println("Enter first day of the year: ");
		int day = input.nextInt();

		String output;
		for (int month = 1; month <= 12; month++) {
			output = "";
			switch (month) {
			case 1:
				output += "January ";
				break;
			case 2:
				output += "February ";
				break;
			case 3:
				output += "March ";
				break;
			case 4:
				output += "April ";
				break;
			case 5:
				output += "May ";
				break;
			case 6:
				output += "June ";
				break;
			case 7:
				output += "July ";
				break;
			case 8:
				output += "August ";
				break;
			case 9:
				output += "September ";
				break;
			case 10:
				output += "October ";
				break;
			case 11:
				output += "November ";
				break;
			case 12:
				output += "December ";
				break;
			}
			output += " " + year;
			System.out.println(output);
			System.out.println("-------------------------------------");
			System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

			switch (day % 7) {
			case 0:

				break;
			case 1:
				System.out.print("     ");
				break;
			case 2:
				System.out.print("          ");
				break;
			case 3:
				System.out.print("               ");
				break;
			case 4:
				System.out.print("                    ");
				break;
			case 5:
				System.out.print("                         ");
				break;
			case 6:
				System.out.print("                              ");
				break;
			}
			
			int dayInMonth;
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				dayInMonth = 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				dayInMonth = 30;
			} else {
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
					dayInMonth = 29;
				} else {
					dayInMonth = 28;
				}
			}
			for (int i = 1; i <= dayInMonth; i++) {
				System.out.printf("%3d  ", i);
				if ((i + day % 7) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();

			day %= 7;
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				day += 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				day += 30;
			} else {
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
					day += 29;
				} else {
					day += 28;
				}
			}
		}

	}
}
