package chapter10.Exercise28;

public class TestMyStringBuilder2 {
	public static void main(String[] args) {
		String st = "a selim";
		MyStringBuilder2 o1 = new MyStringBuilder2(st);
		o1.insert(1, new MyStringBuilder2("hmed"));
		System.out.println(o1.insert(1, new MyStringBuilder2("hmed")));
	}
}
