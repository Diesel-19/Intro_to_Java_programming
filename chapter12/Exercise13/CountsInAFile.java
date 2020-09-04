package chapter12.Exercise13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountsInAFile {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		Scanner input = new Scanner(file);
		Scanner input2 = new Scanner(file);

		int wordCount = 0;
		int letterCount = 0;
		int lineCount = 0;
		while (input.hasNext()) {
			String word = input.next();
			wordCount++;
			letterCount += word.length();
		}

		while (input2.hasNext()) {
			String line = input2.nextLine();
			lineCount++;
		}
		System.out.println("File " + file + " has\n" + letterCount + " characters\n" + wordCount + " words\n"
				+ lineCount + " lines");

		input.close();
		input2.close();
	}
}