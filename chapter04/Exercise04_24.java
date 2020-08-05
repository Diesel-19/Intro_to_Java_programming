package chapter04;

import java.util.Scanner;

public class Exercise04_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first city: ");
		String first = input.nextLine();

		System.out.println("Enter the second city: ");
		String second = input.nextLine();

		System.out.println("Enter the third city: ");
		String third = input.nextLine();

		if (first.compareToIgnoreCase(second) <= 0) {
			if (second.compareToIgnoreCase(third) <= 0) {
				System.out.println(first + " " + second + " " + third);
			} else if (first.compareToIgnoreCase(third) <= 0) {
				System.out.println(first + " " + third + " " + second);
			} else {
				System.out.println(third + " " + first + " " + second);
			}
		} else if (first.compareToIgnoreCase(third) <= 0) {
			System.out.println(second + " " + first + " " + third);
		} else if (second.compareToIgnoreCase(third) <= 0) {
			System.out.println(second + " " + third + " " + first);
		} else {
			System.out.println(third + " " + second + " " + first);
		}
		/*
		 * String temp; 
		 * if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0)) { 
		 * temp = city1; 
		 * city1 = city2; 
		 * city2 = temp; 
		 * } else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0)) { 
		 * temp = city1; 
		 * city1 = city3; 
		 * city3 = temp;
		 * } if (city3.compareTo(city2) < 0) { 
		 * temp = city2; 
		 * city2 = city3; 
		 * city3 = temp; }
		 * 
		 */
	}
}
