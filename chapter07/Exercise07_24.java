package chapter07;

public class Exercise07_24 {
	public static void main(String[] args) {
		int[] suits = new int[4];
		int[] number = new int[13];

		printPicks(suits);
	}

	public static void printPicks(int[] suits) {
		int count = 0;
		boolean allPicked;
		do {
			allPicked = true;
			String output = "";
			int randomSuit = (int) (Math.random() * 4);
			int randomNumber = (int) (Math.random() * 13);
			String[] suitNames = {"Ace" , "2", "3", "4", "5","6","7","8","9","10", "Jack", "Queen", "King"};
			if (suits[randomSuit] == 0) {
				output = (suitNames[randomNumber]) + " of ";
				switch (randomSuit) {
				case 0:
					output += "Spades";
					break;
				case 1:
					output += "Clubs";
					break;
				case 2:
					output += "Hearts";
					break;
				case 3:
					output += "Diamonds";
					break;
				}
				suits[randomSuit]++;
				System.out.println(output);
			}
			count++;
			for (int i : suits) {
				if (i == 0) {
					allPicked = false;
				}
			}
		} while (!allPicked);
		System.out.println("Number of picks: " + count);
	}
}
