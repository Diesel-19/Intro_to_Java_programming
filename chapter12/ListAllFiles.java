package chapter12;

import java.io.File;

public class ListAllFiles {
	public static void main(String[] args) {
		File file = new File("C:\\");
		listFile(file);
	}

	private static void listFile(File file) {
		System.out.println(file.getAbsolutePath());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files != null) {
				for (File f : files) {
					listFile(f);
				}
			}
		}
	}
}
