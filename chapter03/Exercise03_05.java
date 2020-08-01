package chapter03;

import java.util.Scanner;

public class Exercise03_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int day = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int futureDayInput = input.nextInt();

		switch (day) {
		case 0: System.out.print("Today is sunday and "); break;
		case 1: System.out.print("Today is monday and "); break;
		case 2: System.out.print("Today is tuesday and "); break;
		case 3: System.out.print("Today is wednesday and "); break;
		case 4: System.out.print("Today is thursday and "); break;
		case 5: System.out.print("Today is friday and "); break;
		case 6: System.out.print("Today is saturday and "); break;
		default: System.out.print("You entered a wrong day."); break;
		}
		int futureDay = (day + futureDayInput) % 7;
		
		switch (futureDay) {
		case 0: System.out.print("the future day is sunday"); break;
		case 1: System.out.print("the future day is monday"); break;
		case 2: System.out.print("the future day is tuesday"); break;
		case 3: System.out.print("the future day is wednesday"); break;
		case 4: System.out.print("the future day is thursday"); break;
		case 5: System.out.print("the future day is friday"); break;
		case 6: System.out.print("the future day is saturday"); break;
		}
	}

}
