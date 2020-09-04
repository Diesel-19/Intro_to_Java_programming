package chapter12.Exercise21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DataSorted {
	public static void main(String[] args) throws IOException {
		File file = new File("src/chapter12/Exercise21/SortedStrings.txt");
		ArrayList<String> list = new ArrayList<>();
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			list.add(input.nextLine());
		}

		Object[] array = list.toArray();
		String[] sorted = new String[array.length];
		System.arraycopy(array, 0, sorted, 0, array.length);
		Arrays.sort(sorted);

		boolean isEqual = true;
		for (int i = 0; i < sorted.length; i++) {
			if (sorted[i] != array[i]) {
				System.out.println(array[i]);
				System.out.println(sorted[i]);
				isEqual = false;
				break;
			}
		}
		if (isEqual) {
			System.out.println("sorted");
		}
	}
}