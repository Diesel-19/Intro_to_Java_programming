package chapter03;

import java.util.Scanner;

public class Exercise03_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		System.out.println("Enter month: ");
		int month = input.nextInt();
		
		System.out.println("Enter the day of the month: ");
		int dayOfMonth = input.nextInt();
		
		if (month == 1) {
			month = 13;
			year -= 1;
		} else if (month == 2) {
			month = 14;
			year -= 1;
		}
		int k = year % 100; //year of the century
		int j = year / 100; //century
		int day =  (dayOfMonth + (26 * (month + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
		
		switch (day) {
		case 0: System.out.println("Day of the week is Saturday"); break;
		case 1: System.out.println("Day of the week is Sunday"); break;
		case 2: System.out.println("Day of the week is Monday"); break;
		case 3: System.out.println("Day of the week is Tuesday"); break;
		case 4: System.out.println("Day of the week is Wednesday"); break;
		case 5: System.out.println("Day of the week is Thursday"); break;
		case 6: System.out.println("Day of the week is Friday"); break;
		}
	}
}
