package chapter06;

public class Exercise06_30 {
	public static void main(String[] args) {
		play();
	}

	public static void play() {
		int roll = 1;
		while (true) {
			int die1 = (int) (Math.random() * 6) + 1;
			int die2 = (int) (Math.random() * 6) + 1;
			int sum = die1 + die2;
			System.out.println("Die 1: " + die1);
			System.out.println("Die 2: " + die2);
			System.out.println("Sum is: " + sum);

			if (roll == 1) {
				if (sum == 2 || sum == 3 || sum == 12) {
					System.out.println("You lose");
					break;
				} else if (sum == 7 || sum == 11) {
					System.out.println("You win");
					break;
				} else {
					System.out.println("Next roll\n");
					roll++;
				}
			} else if (sum == 7) {
				System.out.println("You lose");
				break;
			} else if (die1 == die2) {
				System.out.println("You win");
				break;
			} else {
				System.out.println("Next roll\n");
				roll++;
			}
		}
	}

}
