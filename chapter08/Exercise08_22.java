package chapter08;

public class Exercise08_22 {
	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		if (checkRowFor1s(matrix) && checkColumnFor1s(matrix)) {
			System.out.println("All even");
		} else if (checkRowFor1s(matrix)) {
			System.out.println("Rows are even");
		} else if (checkColumnFor1s(matrix)) {
			System.out.println("Columns are even");
		} else {
			System.out.println("Nothing even");
		}

	}

	public static boolean checkColumnFor1s(int[][] matrix) {
		for (int j = 0; j < matrix[0].length; j++) {
			int count = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 1) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkRowFor1s(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int count = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}
