package chapter04;

import java.util.Scanner;

public class Exercise04_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of sides: ");
		int n = input.nextInt();
		
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
		System.out.print("The area of the polygon is " + area);
	}

}
