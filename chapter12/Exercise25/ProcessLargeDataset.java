package chapter12.Exercise25;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessLargeDataset {
	public static void main(String[] args) throws IOException {
//		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
//		Scanner input = new Scanner(url.openStream());

		File url = new File("src/chapter12/Exercise24/Salary.txt");
		Scanner input = new Scanner(url);
		ArrayList<Double> assistant = new ArrayList<>();
		ArrayList<Double> associate = new ArrayList<>();
		ArrayList<Double> full = new ArrayList<>();

		while (input.hasNext()) {
			input.next();
			input.next();
			switch (input.next()) {
			case "assistant":
				assistant.add(input.nextDouble());
				break;
			case "associate":
				associate.add(input.nextDouble());
				break;
			case "full":
				full.add(input.nextDouble());
				break;
			}
		}

		double assistantSum = getSum(assistant);
		double associateSum = getSum(associate);
		double fullSum = getSum(full);

		System.out.println("Total salary");
		System.out.println("Assistant: " + assistantSum);
		System.out.println("Asoociate: " + associateSum);
		System.out.println("Full: " + fullSum);
		System.out.println();
		System.out.println("Average salary");
		System.out.println("Assistant: " + assistantSum / assistant.size());
		System.out.println("Asoociate: " + associateSum / associate.size());
		System.out.println("Full: " + fullSum / full.size());
		input.close();
	}

	public static double getSum(ArrayList<Double> arrayList) {
		double sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			sum += arrayList.get(i);
		}
		return sum;
	}
}
