package NumberProgram;

public class ClassB extends ClassA {
	public static String prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return ("b class executing it is prime no");
		} else {
			return ("b class executing not a prime no");
		}
	}

	public static void main(String[] args) {

		ClassB b1 = new ClassB();
		ClassA a1 = b1;// Upcasting
		ClassB c1 = (ClassB) a1;// Downcasting
		System.out.println(a1.prime(3));
		System.out.println(b1.prime(3));
		System.out.println(c1.prime(3));
	}

}
