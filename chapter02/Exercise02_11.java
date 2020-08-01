package chapter02;

import java.util.Scanner;

public class Exercise02_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		int pop = 312032486;
		int secInYear = 365 * 24 * 60 * 60;
		
		int birth = (int)(secInYear * years / 7.);
		int death = (int)(secInYear * years / -13.);
		int immigrant = (int)(secInYear * years / 45.);
		
		int popAfterXYears = birth + immigrant + death + pop;
		System.out.println("The pop in " + years + " years is: " + popAfterXYears);
	}
}