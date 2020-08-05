package chapter04;

import java.util.Scanner;

public class Exercise04_11 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter a decimal value: ");
		int decimal = input.nextInt();
		
		if (decimal <= 9 && 0 <= decimal) {
			System.out.println(decimal);
		} else if (10 <= decimal && decimal <= 15) {
			System.out.println((char) (decimal + 'A' - 10));
		} else {
			System.out.println("Invalid input");
		}
	}

}
