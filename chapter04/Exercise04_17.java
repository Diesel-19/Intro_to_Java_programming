package chapter04;

import java.util.Scanner;

public class Exercise04_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year: ");
		int year = input.nextInt();
		String month = input.nextLine();

		System.out.println("Enter a month ");
		month = input.nextLine();

		boolean isLeapYear = false;
		int days = 0;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isLeapYear = true;
		}

		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "July":
		case "Aug":
		case "Oct":
		case "Dec":
			days = 31;
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			days = 30;
			break;
		case "Feb":
			if (isLeapYear) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		}
		System.out.println(month + " " + year + " has " + days + " days");
	}
}
