package chapter02;

import java.util.Scanner;

public class Chapter02_Learning01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of seconds: ");
		int seconds = input.nextInt();
		int min = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + min + " minutes " + remainingSeconds + " seconds");
	}
}
