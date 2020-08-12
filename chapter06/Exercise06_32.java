package chapter06;

public class Exercise06_32 {
	public static void main(String[] args) {
		int playAmount = 10_000;
		play(playAmount);
	}

	public static void play(int playAmount) {
		int roll = 1;
		int lossCount = 0;
		int winCount = 0;
		while (roll <= playAmount) {
			int die1 = (int) (Math.random() * 6) + 1;
			int die2 = (int) (Math.random() * 6) + 1;
			int sum = die1 + die2;

			if (roll == 1) {
				if (sum == 2 || sum == 3 || sum == 12) {
					lossCount++;
				} else if (sum == 7 || sum == 11) {
					winCount++;
				} else {
					roll++;
				}
			} else if (sum == 7) {
				winCount++;
			} else if (die1 == die2) {
				lossCount++;
			} else {
				roll++;
			}
		}

		System.out.println("Won games: " + winCount);
		System.out.println("Lost games: " + lossCount);
	}

}
