package chapter12.Exercise24;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class CreateLargeDataset {
	public static void main(String[] args) throws IOException {
		File file = new File("src/chapter12/Exercise24/Salary.txt");
		PrintWriter output = new PrintWriter(file);

		String[] rank = { "assistant", "associate", "full" };

		for (int i = 1; i < 1000; i++) {
			String randomRank = rank[(int) (Math.random() * 3)];
			double salary = 0;
			Random random = new Random();
			switch (randomRank) {
			case "assistant":
				salary = random.nextInt(30000) + 50000;
				break;
			case "associate":
				salary = random.nextInt(60000) + 50000;
				break;
			case "full":
				salary = random.nextInt(75000) + 55000;
				break;
			}
			salary += (int) (Math.random() * 100) / 100.;
			output.println("FirstName" + i + " LastName" + i + " " + randomRank + " " + salary);
		}
		output.close();
	}
}
