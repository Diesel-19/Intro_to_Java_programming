package chapter12.Exercise23;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ProcessScoresFromWeb {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
		Scanner input = new Scanner(url.openStream());

		int sum = 0;
		int count = 0;
		while (input.hasNext()) {
			sum += input.nextInt();
			count++;
		}
		System.out.println("Total: " + sum + "\nAverage: " + (sum / count));
	}
}
