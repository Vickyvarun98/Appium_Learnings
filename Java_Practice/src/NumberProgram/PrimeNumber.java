package NumberProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		PrimeNumber num = new PrimeNumber();
		String Number = num.primeNumber(n);
		System.out.println(Number);
	}

	public String primeNumber(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return ("The Number " + n + " is a Prime Number");
		} else {
			return ("The Number " + n + " is not a Prime Number");
		}

	}

}
