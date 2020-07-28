package chapter02;

import java.util.Scanner;

public class Chapter02_Learning07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.print("Sales tax is " + (int)(tax * 100) / 100.0); //2 decimals after comma
	}

}
