package chapter07;

public class Exercise07_16 {
	public static void main(String[] args) {
		int[] randomArray = new int[1_000_000];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 1_000_000);
		}
		int key = (int) (Math.random() * 1_000_000);
		long startTime = System.currentTimeMillis();
		System.out.println(linearSearch(randomArray, key));
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);

		selectionSort(randomArray);

		startTime = System.currentTimeMillis();
		System.out.println(binarySearch(randomArray, key));
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(executionTime);
	}

	public static int[] selectionSort(int[] randomArray) {
		for (int i = 0; i < randomArray.length - 1; i++) {

			int min = randomArray[i];
			int minIndex = 0;
			for (int j = i + 1; j < randomArray.length; j++) {
				if (randomArray[j] < min) {
					min = randomArray[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				randomArray[minIndex] = randomArray[i];
				randomArray[i] = min;
			}
		}
		return randomArray;
	}

	public static int binarySearch(int[] randomArray, int key) {
		int low = 0;
		int high = randomArray.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < randomArray[mid]) {
				high = mid - 1;
			} else if (key > randomArray[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static int linearSearch(int[] randomArray, int key) {
		for (int i = 0; i < randomArray.length; i++) {
			if (key == randomArray[i]) {
				return i;
			}
		}
		return -1;
	}
}
