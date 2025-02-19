package NumberProgram;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt(), sum = 0, n = a;
		while (n > 0) {
			int d = n % 10;
			sum += d;
			n /= 10;
		}
		System.out.println("The sum of digits of " + a + " is " + sum);

	}

}
