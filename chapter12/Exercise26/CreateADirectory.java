package chapter12.Exercise26;

import java.io.File;
import java.util.Scanner;

public class CreateADirectory {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a directory");
		File file = new File(input.nextLine());
		if (file.exists()) {
			System.out.println("Directory already exists");
		} else {
			file.mkdirs();
			System.out.println("Directory created succesfully");
		}
		input.close();
	}
}
