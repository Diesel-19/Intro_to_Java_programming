package chapter12.Exercise15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class WriteReadData {
	public static void main(String[] args) throws IOException {
		File file = new File("src/chapter12/Exercise15/Exercise12_15.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		writeData(file);
		int[] numbers = readData(file);

		Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}

	public static void writeData(File file) {
		try {
			PrintWriter output = new PrintWriter(file);
			for (int i = 0; i < 100; i++) {
				output.print((int) (Math.random() * 100) + " ");
			}
			output.close();
		} catch (FileNotFoundException ex) {
		}
	}

	public static int[] readData(File file) {
		int[] numbers = new int[100];
		try {
			Scanner input = new Scanner(file);
			int index = 0;
			while (input.hasNext()) {
				numbers[index] = input.nextInt();
				index++;
			}
			input.close();
		} catch (FileNotFoundException ex) {
		}
		return numbers;
	}
}
