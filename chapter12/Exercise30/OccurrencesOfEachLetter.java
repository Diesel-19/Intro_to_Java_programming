package chapter12.Exercise30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OccurrencesOfEachLetter {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a txt document path");
		String path = input.nextLine();
		File file = new File(path);
		input = new Scanner(file);
		int[] letterOccurrences = new int[26];
		while (input.hasNext()) {
			String line = input.nextLine().toUpperCase();
			for (int i = 0; i < line.length(); i++) {
				if (Character.isLetter(line.charAt(i)))
					letterOccurrences[line.charAt(i) - 65]++;
			}
		}
		for (int i = 0; i < 25; i++) {
			System.out.println((char) (i + 65) + " occurrs " + letterOccurrences[i] + " times");
		}
	}
}
