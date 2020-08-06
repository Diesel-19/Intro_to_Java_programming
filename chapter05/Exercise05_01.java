package chapter05;

import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer the input ends if it is 0: ");
		
		
		int negative = 0;
		int positive = 0;
		double sum = 0;
		int count = 0;
		int i;
		while ((i = input.nextInt()) != 0) {
			
			sum += i;
			if (i < 0) {
				negative++;
			} else {
				positive++;
			}
			count++;

		} 
		System.out.println("The number of positives is: " + positive + "\nThe number of negatives is: " + negative
				+ "\nThe total is " + sum + "\nThe average is: " + (sum / count));
	}
}