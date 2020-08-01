package chapter03;

import java.util.Scanner;

public class Exercise03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Heads or Tails (0 or 1)? ");
		int guess = input.nextInt();
		
		int roll = (int) (Math.random() * 2);
		
		if (guess == roll) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
	}
}