package NumberProgram;

import java.util.Scanner;

public class FactorsOfGivenNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n = s.nextInt();
		System.out.println("The factors of " + n + " is");
		factors(n);
	}

	public static void factors(int a) {
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
	}

}
