package chapter08;

public class Exercise08_18 {
	public static void main(String[] args) {
		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };

		shuffle(m);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
		}
	}

	public static void shuffle(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int[] temp = new int[2];
			int random = (int) (Math.random() * m.length);

			for (int j = 0; j < m[0].length; j++) {
				temp[j] = m[i][j];
			}
			for (int j = 0; j < temp.length; j++) {
				m[i][j] = m[random][j];
			}
			for (int j = 0; j < temp.length; j++) {
				m[random][j] = temp[j];
			}
		}

	}
}
