package chapter02;

import java.util.Scanner;

public class Chapter02_Learning06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give Fahrenheit: ");
		int fahrenheit = input.nextInt();
		int celsius = (int)(5. / 9 * (fahrenheit - 32));
		System.out.println(celsius + " celsius");
	}

}