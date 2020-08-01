package chapter02;

import java.util.Scanner;

public class Exercise02_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		double minutes = input.nextInt();
		
		double hours = minutes / 60;
		int days = (int)(hours / 24);
		int remainDays = days % 365;
		int years = days / 365;
		
		System.out.println(years + " years\n" + remainDays + " days");
	}
}