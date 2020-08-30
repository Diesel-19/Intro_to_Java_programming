package chapter10.Exercise23;

public class TestMyString2 {
	public static void main(String[] args) {
		MyString2 a = new MyString2("abdced");
		System.out.println(a.compare("abdcede"));
		System.out.println(a.compare("abdcec"));
		char[] b = a.toChars();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.println();
		MyString2 c = a.substring(2);
		System.out.println(c.getS());
		System.out.println(a.toUpperCase().getS());
		System.out.println(MyString2.valueOf(false).getS());
	}
}
