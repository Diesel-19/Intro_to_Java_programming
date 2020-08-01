package chapter03;

import java.util.Scanner;

public class Exercise03_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Rock, paper or scissors (0, 1, 2)? ");
		int player = input.nextInt();
		
		int computer = (int) (Math.random() * 3);
		
		switch (player) {
		case 0: switch (computer) {
		case 0: System.out.println("You are rock, computer is rock. It's a draw."); break;
		case 1: System.out.println("You are rock, computer is paper. Computer wins."); break;
		case 2: System.out.println("You are rock, computer is scissors. You win."); break;
		} break;
		case 1: switch (computer) {
		case 0: System.out.println("You are paper, computer is rock. You win."); break;
		case 1: System.out.println("You are paper, computer is paper. It's a draw."); break;
		case 2: System.out.println("You are paper, computer is scissors. Computer wins."); break;
		} break;
		case 2: switch (computer) {
		case 0: System.out.println("You are scissors, computer is rock. Computer wins"); break;
		case 1: System.out.println("You are scissors, computer is paper. You win."); break;
		case 2: System.out.println("You are scissors, computer is scissors. It's a draw"); break;
		} break;
		default: System.out.println("Wrong input.");	
		}
	}
}
