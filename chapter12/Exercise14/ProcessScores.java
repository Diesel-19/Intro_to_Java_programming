package chapter12.Exercise14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProcessScores {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter file");
		File file;
		Scanner input;
		while (true) {
			input = new Scanner(System.in);
			try {
				file = new File(input.nextLine());
				if (!file.exists()) {
					input.close();
					throw new FileNotFoundException();
				}
				break;
			} catch (Exception ex) {
				System.err.println("File doesn't exist");
				System.err.println("Enter a file");
			}
		}
		input = new Scanner(file);
		double sum = 0;
		int count = 0;
		while (input.hasNext()) {
			sum += input.nextDouble();
			count++;
		}
		System.out.println("Average is: " + sum / count);
		System.out.println("Sum is: " + sum);
		input.close();
	}
}
