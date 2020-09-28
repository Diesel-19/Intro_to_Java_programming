package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
	public static void main(String[] args) throws IOException {
		try (
			FileOutputStream output = new FileOutputStream("src/chapter17/temp.dat");
			) {
			for (int i = 1; i <= 10; i++) {
				output.write(i);
			}
		}
		try (
			FileInputStream input = new FileInputStream("src/chapter17/temp.dat");
			) {
			int value;
			while ((value = input.read()) != -1) {
				System.out.print(value + " ");
			}
		}

	}
}
