package chapter06;

import java.util.Scanner;

public class Exercise06_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers to sort them in increasing order: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
	}
	public static void displaySortedNumbers (double num1, double num2, double num3) {
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
