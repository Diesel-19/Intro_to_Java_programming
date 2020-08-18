package chapter08;

public class Exercise08_10 {
	public static void main(String[] args) {
		// create matrix
		// print matrix
		// row with most 1
		// column with most 1
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		int maxRowSum = 0;
		int maxRowIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				sum += matrix[i][j];
			}
			if (maxRowSum < sum) {
				maxRowSum = sum;
				maxRowIndex = i;
			}
		}
		int maxColumnSum = 0;
		int maxColumnIndex = 0;
		for (int j = 0; j < matrix[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < matrix.length; i++) {
				sum += matrix[i][j];
			}
			if (maxColumnSum < sum) {
				maxColumnSum = sum;
				maxColumnIndex = j;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The largest row index: " + maxRowIndex);
		System.out.println("The largest column index: " + maxColumnIndex);
	}
}
