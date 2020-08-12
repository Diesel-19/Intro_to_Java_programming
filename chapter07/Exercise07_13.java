package chapter07;

public class Exercise07_13 {
	public static void main(String[] args) {
		int[] excluded = new int[53];
		for (int i = 0; i < excluded.length; i++) {
			excluded[i] = i + 1;
		}
		int random = getRandom(excluded);
	}

	public static int getRandom(int[] excluded) {
		int random = (int) (Math.random() * 54) + 1;
		boolean isEqual = false;
		int i = 0;
		while (!isEqual && i < excluded.length)
			if (random == excluded[i]) {
				isEqual = true;
		}
		return random;
	}
}
