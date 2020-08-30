package chapter10.Exercise23;

public class MyString2 {
	private String s;

	public MyString2(String s) {
		this.s = s;
	}

	public int compare(String s) {
		int i = 0;
		for (i = 0; i < Math.min(s.length(), this.s.length()); i++) {
			if (this.s.charAt(i) < s.charAt(i)) {
				return -1;
			} else if (s.charAt(i) < this.s.charAt(i)) {
				return 1;
			} else {
				continue;
			}
		}
		if (this.s.length() == s.length()) {
			return 0;
		} else {
			return s.length() < this.s.length() ? 1 : -1;
		}

	}

	public MyString2 substring(int begin) {
		String a = "";
		for (int i = begin; i < s.length(); i++) {
			a += s.charAt(i);
		}
		return new MyString2(a);

	}

	public MyString2 toUpperCase() {
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 123 && 96 < s.charAt(i)) {
				a += (char) (s.charAt(i) - 32);
			} else {
				a += (char) (s.charAt(i));
			}
		}
		return new MyString2(a);
	}

	public char[] toChars() {
		char[] a = new char[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.charAt(i);
		}
		return a;
	}

	public static MyString2 valueOf(boolean b) {
		return b ? new MyString2("true") : new MyString2("false");
	}

	public String getS() {
		return s;
	}

}
