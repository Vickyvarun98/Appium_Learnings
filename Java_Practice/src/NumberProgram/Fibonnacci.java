package NumberProgram;

public class Fibonnacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		int n = 7;
		System.out.println("The fibonacci series is");
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
