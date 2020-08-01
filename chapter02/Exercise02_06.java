package chapter02;

import java.util.Scanner;

public class Exercise02_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int firstDigit = number / 100;
		int remain = number % 100;
		
		int secondDigit = remain / 10;
		remain = number % 10;
		
		int thirdDigit = remain;
		int sum = firstDigit + secondDigit + thirdDigit;
		
		System.out.println("The sum of digits is: " + sum);
	}

}
