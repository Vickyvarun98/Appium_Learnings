package NumberProgram;

public class Operations {

	public static void main(String[] args) {
		int a = 10;
		int b = ++a;
		int c = b++;
		int d = c++;
		int e = ++a - c++ - a++ - b-- + ++d + ++c - --b + d++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(++b);
		System.out.println(c++);
		System.out.println(++c);
		int result = a + b + c + d + e;
		System.out.println(result);
	}

}
