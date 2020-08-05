package chapter04;

import java.util.Scanner;

public class Exercise04_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN: ");
		String str = input.nextLine();
		
		int d1 = Integer.parseInt(str.substring(0, 1));
		int d2 = Integer.parseInt(str.substring(1, 2));
		int d3 = Integer.parseInt(str.substring(2, 3));
		int d4 = Integer.parseInt(str.substring(3, 4));
		int d5 = Integer.parseInt(str.substring(4, 5));
		int d6 = Integer.parseInt(str.substring(5, 6));
		int d7 = Integer.parseInt(str.substring(6, 7));
		int d8 = Integer.parseInt(str.substring(7, 8));
		int d9 = Integer.parseInt(str.substring(8, 9));
		
		int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 +d7 * 7 + d8 * 8 + d9 * 9) % 11;
		String all = str + d10;
		System.out.println(all);
		
	}
}