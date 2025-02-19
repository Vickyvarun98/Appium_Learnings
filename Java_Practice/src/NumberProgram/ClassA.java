package NumberProgram;

public class ClassA {
	public static String prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return ("a class executing it is prime no");
		} else {
			return ("a class executing not a prime no");
		}

	}
}