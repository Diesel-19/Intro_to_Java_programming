package chapter12.Exercise19;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.d.umn.edu/~rmaclin/gettysburg-address.html");
		Scanner input = new Scanner(url.openStream());
		int wordCount = 0;
		while (input.hasNext()) {
			input.next();
			wordCount++;
		}
		System.out.println(wordCount);
	}
}
