package chapter06;

public class Exercise06_16 {
	public static void main(String[] args) {
		int[][] m = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		sort(m);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sort(int m[][]) {
		int[] temp = new int[m[0].length];
		// sort first column
		for (int i = 0; i < m.length - 1; i++) {
			int min = m[i][0];
			int minIndex = i;
			for (int j = i + 1; j < m.length; j++) {
				if (m[j][0] < min) {
					minIndex = j;
					min = m[j][0];
				}
			}
			if (i != minIndex) {
				for (int j2 = 0; j2 < temp.length; j2++) {
					temp[j2] = m[minIndex][j2];
				}
				for (int j2 = 0; j2 < temp.length; j2++) {
					m[minIndex][j2] = m[i][j2];
				}
				for (int j2 = 0; j2 < temp.length; j2++) {
					m[i][j2] = temp[j2];
				}
			}
		}
		// sort second column while the first column is still sorted
		for (int i = 0; i < m.length - 1; i++) {
			int min = m[i][1];
			int minIndex = i;
			for (int j = i + 1; j < m.length; j++) {
				if (m[j][1] < min && m[i][0] == m[j][0]) {
					minIndex = j;
					min = m[j][1];
				}
			}
			if (i != minIndex) {
				for (int j2 = 0; j2 < temp.length; j2++) {
					temp[j2] = m[minIndex][j2];
				}
				for (int j2 = 0; j2 < temp.length; j2++) {
					m[minIndex][j2] = m[i][j2];
				}
				for (int j2 = 0; j2 < temp.length; j2++) {
					m[i][j2] = temp[j2];
				}
			}
		}
	}
}
