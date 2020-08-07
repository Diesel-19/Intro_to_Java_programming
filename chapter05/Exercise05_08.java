package chapter05;

import java.util.Scanner;

public class Exercise05_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double point = 0;
		double temp = point;
		String comb = "";
		
		System.out.println("Enter the amount point(-1 to end) and the name of the student");
		while (true) {
			
			point = input.nextDouble();
			if (point == -1) {
				break;
			}
			String name = input.nextLine();

			if (point > temp) {
				temp = point;
				comb = temp + " " + name;
			}
		}
		System.out.println(comb);

	}

}
