package chapter10.Exercise25;

public class NewStringSplitMethod {
	public static void main(String[] args) {
		String[] a = split("ab#12#453", "#");
		String[] b = split("a?b?gf#e", "[?#]");
	}

	public static String[] split(String s, String regex) {
		String[] a = new String[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i] = null;
		}
		for (int i = 0; i < s.length(); i++) {
			int index = 0;

		}
		return a;
	}
}
