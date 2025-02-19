package NumberProgram;

import java.util.Scanner;

public class MinimumNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		long l = s.nextLong();
		long b = l;
		long min = l % 10;
		while (l != 0) {
			long a = l % 10;
			if (a < min) {
				min = a;
			}
			l /= 10;
		}
		System.out.println("The minimum number in " + b + " is " + min);
	}

}
