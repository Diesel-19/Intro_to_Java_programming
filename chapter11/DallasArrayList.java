package chapter11;

import java.util.ArrayList;

public class DallasArrayList {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Dallas");
		list.add("Dallas");
		list.add("Ankara");
		list.add("Dallas");
		for (int i = 0; i < list.size(); i++)
			list.remove("Dallas");
	}
}
