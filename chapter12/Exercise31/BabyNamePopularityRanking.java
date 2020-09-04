package chapter12.Exercise31;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BabyNamePopularityRanking {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year");
		String year = input.next();
		System.out.println("Enter a gender");
		String gender = input.next();
		System.out.println("Enter the name");
		String name = input.next();

		File file = new File("src/chapter12/Exercise31/babynameranking" + year + ".txt");
		input = new Scanner(file);
		int rank = -1;
		String rankingName = "";
		boolean found = false;
		if (gender.toUpperCase().charAt(0) == 'M') {
			while (input.hasNext()) {
				rank = input.nextInt();
				rankingName = input.next();
				if (rankingName.equalsIgnoreCase(name)) {
					found = true;
					break;
				}
				input.nextLine();
			}
		} else if (gender.toUpperCase().charAt(0) == 'F') {
			while (input.hasNext()) {
				rank = input.nextInt();
				input.next();
				input.next();
				rankingName = input.next();
				if (rankingName.equalsIgnoreCase(name)) {
					found = true;
					break;
				}
				input.next();
			}
		}
		if (found) {
			System.out.println(name + " is ranked #" + rank + " in year " + year);
		} else {
			System.out.println("Name wasn't found");
		}
	}
}
